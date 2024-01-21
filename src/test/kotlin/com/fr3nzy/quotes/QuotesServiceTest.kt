package com.fr3nzy.quotes

import com.fr3nzy.quotes.domain.quotes.repository.QuotesRepository
import com.fr3nzy.quotes.domain.quotes.QuotesService
import com.fr3nzy.quotes.domain.quotes.repository.model.QuoteEntity
import com.fr3nzy.quotes.domain.quotes.repository.model.QuoteStatus
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import io.mockk.junit5.MockKExtension
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import java.time.OffsetDateTime
import java.util.UUID

@ExtendWith(MockKExtension::class)
class QuotesServiceTest {

    @MockK
    private lateinit var repository: QuotesRepository

    @InjectMockKs
    private lateinit var quotesService: QuotesService

    @Test
    fun getRandomQuote() {
        every { repository.findAllByStatus(any()) } returns quotes
        Assertions.assertThat(quotesService.getRandomQuote(null).priority)
            .isEqualTo(30)
    }

    companion object {
        val quotes = listOf(
            QuoteEntity(
                id = UUID.randomUUID(),
                text = "",
                originalText = "",
                hash = 1,
                status = QuoteStatus.UNREAD,
                priority = 10,
                createdAt = OffsetDateTime.now(),
                updatedAt = OffsetDateTime.now(),
            ),
            QuoteEntity(
                id = UUID.randomUUID(),
                text = "",
                originalText = "",
                hash = 1,
                status = QuoteStatus.UNREAD,
                priority = 20,
                createdAt = OffsetDateTime.now(),
                updatedAt = OffsetDateTime.now(),
            ),
            QuoteEntity(
                id = UUID.randomUUID(),
                text = "",
                originalText = "",
                hash = 1,
                status = QuoteStatus.UNREAD,
                priority = 30,
                createdAt = OffsetDateTime.now(),
                updatedAt = OffsetDateTime.now(),
            ),
        )

    }
}