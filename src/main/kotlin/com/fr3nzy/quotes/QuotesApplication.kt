package com.fr3nzy.quotes

import com.fr3nzy.quotes.domain.quotes.QuotesService
import com.fr3nzy.quotes.domain.telegram.DailyQuotesBot
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling
import org.telegram.telegrambots.meta.TelegramBotsApi
import org.telegram.telegrambots.meta.exceptions.TelegramApiException
import org.telegram.telegrambots.meta.generics.LongPollingBot
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession


@SpringBootApplication
@EnableScheduling
class WebParserApplication

fun main(args: Array<String>) {
    val applicationContext = runApplication<WebParserApplication>(*args)
    try {
        val botsApi = TelegramBotsApi(DefaultBotSession::class.java)
        val dailyQuotesBot = applicationContext.getBean(DailyQuotesBot::class.java)
        val quotesService = applicationContext.getBean(QuotesService::class.java)
        botsApi.registerBot(dailyQuotesBot as LongPollingBot)
        val next = quotesService.skipQuote()
        dailyQuotesBot.sendMessage(
            "Next quote with id ${quotesService.nextQuote} is \n ${next.text}",
            dailyQuotesBot.adminGroup
        )
    } catch (e: TelegramApiException) {
        throw RuntimeException(e)
    }
}
