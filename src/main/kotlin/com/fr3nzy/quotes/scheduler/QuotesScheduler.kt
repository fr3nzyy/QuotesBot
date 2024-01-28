package com.fr3nzy.quotes.scheduler

import com.fr3nzy.quotes.domain.quotes.QuotesService
import com.fr3nzy.quotes.domain.quotes.repository.model.QuoteEntity
import com.fr3nzy.quotes.domain.telegram.DailyQuotesBot
import org.slf4j.LoggerFactory
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component
import java.util.UUID

@Component
class QuotesScheduler(
    private val dailyQuotesBot: DailyQuotesBot,
    private val quotesService: QuotesService,
) {
    private val logger = LoggerFactory.getLogger(javaClass)

    val publicGroup = -1002031671992
    val adminGroup = -4025089603
    val channel = -1002014814630


    //    @Scheduled(cron = "0/20 * * * * *")
    @Scheduled(cron = "\${quotes.cron}")
//    @Scheduled(cron = "-")
    fun process() {
        val quoteDto = prepareQuote()
        dailyQuotesBot.sendMessage(quoteDto.text, channel)
        quotesService.readQuote(quoteDto.quoteEntity.id)

        val nextQuoteDto = getRandomQuote(null)
        quotesService.nextQuote = nextQuoteDto.id
        logger.info("next quote id is ${quotesService.nextQuote}")
        val next = prepareAdminQuote(nextQuoteDto)
        dailyQuotesBot.sendMessage("Next quote is: \n $next", adminGroup)
    }

    fun prepareQuote(): QuoteDto {
        getRandomQuote(quotesService.nextQuote)
            .let { it ->
                val author = it.author?.let { "\n\n${it}" }
                return QuoteDto(it, "${it.text}$author")
            }
    }

    fun prepareAdminQuote(quoteEntity: QuoteEntity): String {
        return "${quoteEntity.text}\n\n${quoteEntity.author}\n\n${quoteEntity.id}"
    }

    fun getRandomQuote(nextQuoteId: UUID? = null): QuoteEntity {
        return quotesService.getRandomQuote(nextQuoteId)
    }

    data class QuoteDto(
        val quoteEntity: QuoteEntity,
        val text: String,
    )
}