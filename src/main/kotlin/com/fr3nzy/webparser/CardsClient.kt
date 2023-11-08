package com.fr3nzy.webparser

import com.fr3nzy.webparser.WebClientConfiguration.Companion.CARDS
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.client.awaitBody

@Service
class CardsClient(
    @Qualifier(CARDS)
    private val client: WebClient,
) {
    suspend fun getActiveCardsCount(): Any {
        return client.get()
            .uri("/genre/%D0%9A%D0%BB%D0%B0%D1%81%D1%81%D0%B8%D0%BA%D0%B8-%D0%BF%D1%81%D0%B8%D1%85%D0%BE%D0%BB%D0%BE%D0%B3%D0%B8%D0%B8/quotes")
            .retrieve()
            .toEntity(String::class.java)
    }
}
