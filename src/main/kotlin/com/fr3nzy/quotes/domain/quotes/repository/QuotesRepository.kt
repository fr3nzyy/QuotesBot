package com.fr3nzy.quotes.domain.quotes.repository

import com.fr3nzy.quotes.domain.quotes.repository.model.QuoteEntity
import com.fr3nzy.quotes.domain.quotes.repository.model.QuoteStatus
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface QuotesRepository : CrudRepository<QuoteEntity, UUID> {
    fun findAllByStatus(status: QuoteStatus): List<QuoteEntity>
}
