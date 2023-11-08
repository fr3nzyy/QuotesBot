package com.fr3nzy.quotes

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
//        botsApi.registerBot(applicationContext.getBean("com.fr3nzy.quotes.domain.telegram.DailyQuotesBot", TelegramLongPollingBot::class.java))
        val dailyQuotesBot = applicationContext.getBean(DailyQuotesBot::class.java)
        botsApi.registerBot(dailyQuotesBot as LongPollingBot)

    } catch (e: TelegramApiException) {
        throw RuntimeException(e)
    }
}
