package com.fr3nzy.webparser

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.HttpHeaders
import org.springframework.http.MediaType
import org.springframework.web.reactive.function.client.WebClient

@Configuration
class WebClientConfiguration {

    @Bean(CARDS)
    fun webClient(objectMapper: ObjectMapper): WebClient =
        WebClient.builder()
            .baseUrl("https://www.livelib.ru/")
            .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.ALL_VALUE)
            .build()

    companion object {
        const val CARDS = "CARDS"
    }
}
