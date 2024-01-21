package com.fr3nzy.quotes.domain.quotes.repository.model

import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.OffsetDateTime
import java.util.UUID

@Entity
@Table(name = "quotes")
data class QuoteEntity(
    @Id val id: UUID,
    val text: String,
    val originalText: String,
    val author: String? = null,
    val bookName: String? = null,
    val description: String? = null,
    val hash: Int,
    @Enumerated(EnumType.STRING)
    val status: QuoteStatus,
    val priority: Int,
    val createdAt: OffsetDateTime = OffsetDateTime.now(),
    val updatedAt: OffsetDateTime = OffsetDateTime.now()
)
