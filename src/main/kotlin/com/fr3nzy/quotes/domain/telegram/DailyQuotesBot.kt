package com.fr3nzy.quotes.domain.telegram

import com.fr3nzy.quotes.domain.quotes.QuotesService
import org.slf4j.LoggerFactory
import org.springframework.core.env.Environment
import org.springframework.stereotype.Component
import org.telegram.abilitybots.api.bot.AbilityBot
import org.telegram.abilitybots.api.objects.Ability
import org.telegram.abilitybots.api.objects.Locality.GROUP
import org.telegram.abilitybots.api.objects.Privacy.GROUP_ADMIN
import org.telegram.abilitybots.api.objects.Privacy.PUBLIC


@Component
class DailyQuotesBot(
    env: Environment,
    private val quotesService: QuotesService,
//) : AbilityBot(env.getProperty("botToken"), "DailyQuotesBBot") {
) : AbilityBot("", "") {

    private val logger = LoggerFactory.getLogger(javaClass)

    //    val publicGroup = -1002031671992
//    val channel = "@thedailyyquotes"
    val channel = -1002014814630
    val adminGroup = -4025089603

    fun startBot(): Ability {
        return Ability
            .builder()
            .name("start")
            .locality(GROUP)
            .privacy(PUBLIC)
            .action { ctx -> silent.send("${super.admins()}", ctx.chatId()).also { println(ctx.chatId()) } }
            .build()
    }

    fun skipQuote(): Ability {
        return Ability
            .builder()
            .name("skip")
            .locality(GROUP)
            .privacy(GROUP_ADMIN)
            .action { ctx ->
                silent.send(
                    "Quote with id ${quotesService.getQuote(quotesService.nextQuote)!!.id} skipped",
                    ctx.chatId()
                )
                quotesService.skipQuote().let {
                    silent.send("Next quote with id ${quotesService.nextQuote} is \n ${it.text}", ctx.chatId())
                }
            }
            .build()
    }

    fun nextQuote(): Ability {
        return Ability
            .builder()
            .name("next")
            .locality(GROUP)
            .privacy(GROUP_ADMIN)
            .action { ctx ->
                quotesService.nextQuote?.let {
                    quotesService.getQuote(quotesService.nextQuote)!!.let {
                        silent.send("Next quote with id ${quotesService.nextQuote} is \n ${it.text}", ctx.chatId())
                    }
                }
                    ?: silent.send("Next quote is null", ctx.chatId())
            }
            .build()
    }

    override fun creatorId(): Long {
        return 1L
    }

    fun sendMessage(message: String, group: Long) {
        logger.info("Send message: $message")
        silent.send(message, group)
    }

    override fun onRegister() {

        super<AbilityBot>.onRegister()
    }
}

