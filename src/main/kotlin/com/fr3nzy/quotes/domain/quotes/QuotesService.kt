package com.fr3nzy.quotes.domain.quotes

import com.fr3nzy.quotes.domain.quotes.repository.QuotesRepository
import com.fr3nzy.quotes.domain.quotes.repository.model.QuoteEntity
import com.fr3nzy.quotes.domain.quotes.repository.model.QuoteStatus
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import java.util.Random
import java.util.UUID

@Service
class QuotesService(
    private val repository: QuotesRepository,
) {
    private val logger = LoggerFactory.getLogger(javaClass)
    var nextQuote: UUID? = null

    fun saveQuotes(quotes: List<Quote>) {
        val quoteEntities = quotes.map {
            QuoteEntity(
                id = UUID.randomUUID(),
                text = it.text,
                originalText = it.originalText,
                author = it.bookAuthor,
                bookName = it.bookName,
                hash = it.text.hashCode(),
                status = QuoteStatus.UNREAD,
                priority = 50
            )
        }
        quoteEntities.groupingBy { it.hash }.eachCount().filterValues { it > 1 }.forEach {
            println("Similar hashes: $it")
        }
        repository.saveAll(quoteEntities)
    }

    fun save(quote: Quote) {
        val entity = quote.let {
            QuoteEntity(
                id = UUID.randomUUID(),
                text = it.text,
                originalText = it.originalText,
                author = it.bookAuthor,
                bookName = it.bookName,
                hash = it.text.hashCode(),
                status = QuoteStatus.UNREAD,
                priority = 50
            )
        }
        repository.save(entity)
    }

    fun readQuote(quoteId: UUID?) {
        if (quoteId != null) {
            repository.findById(quoteId).get().let {
                repository.save(it.copy(status = QuoteStatus.READ))
                logger.info("Quote with id $quoteId read")
            }
        }
    }

    fun getQuote(quoteId: UUID?) = quoteId?.let { repository.findById(quoteId).get() }
    fun getRandomQuote(nextQuoteId: UUID?): QuoteEntity {
        if (nextQuoteId != null) {
            return repository.findById(nextQuoteId).get()
        } else {
            val quoteEntities = repository.findAllByStatus(QuoteStatus.UNREAD)
            val quoteList = quoteEntities.groupBy { it.priority }

            val prioritisedQuoteList = quoteList[quoteList.keys.maxOf { it }]!!
            return prioritisedQuoteList[Random().nextInt(prioritisedQuoteList.size)]
        }
    }

    fun skipQuote(): QuoteEntity {
        readQuote(this.nextQuote)
        val nextQuoteDto = getRandomQuote(null)
        this.nextQuote = nextQuoteDto.id
        return nextQuoteDto
    }
}