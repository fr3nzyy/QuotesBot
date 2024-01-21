package com.fr3nzy.quotes.domain.quotes

data class Quote(
    val originalText: String,
    val text: String,
    val bookAuthor: String?,
    val bookName: String,
)
