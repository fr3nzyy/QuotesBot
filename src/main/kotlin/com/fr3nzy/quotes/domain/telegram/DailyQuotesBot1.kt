//package com.fr3nzy.quotes.domain.telegram
//
//import com.fr3nzy.quotes.domain.quotes.QuotesService
//import org.springframework.core.env.Environment
//import org.springframework.stereotype.Component
//import org.telegram.abilitybots.api.bot.AbilityBot
//import org.telegram.abilitybots.api.objects.Ability
//import org.telegram.abilitybots.api.objects.Locality.USER
//import org.telegram.abilitybots.api.objects.Locality.GROUP
//import org.telegram.abilitybots.api.objects.Privacy.PUBLIC
//import org.telegram.telegrambots.meta.api.methods.send.SendMessage
//
//
//@Component
//class DailyQuotesBot1(
//    env: Environment,
//    private val quotesService: QuotesService,
//    private val responseHandler: ResponseHandler,
////) : AbilityBot(env.getProperty("botToken"), "DailyQuotesBBot") {
//) : AbilityBot("6375366598:AAFtHFVJzgg1FvRYp8FHFvekmmQO-StAdlY", "DailyQuotesBBot") {
//
//    fun startBot(): Ability {
//        return Ability
//            .builder()
////            .post { ctx -> silent.send(prepareQuote(), ctx.chatId()) }
////            .name("start")
//            .locality(GROUP)
////            .locality(USER)
//            .privacy(PUBLIC)
////            .action { ctx -> silent.send(prepareQuote(), ctx.chatId()) }
//            .build()
//    }
//
//    fun prepareQuote(): String {
//        return quotesService.getRandomQuote().let { it ->
//            val author = it.author?.let { "\n\n${it}" }
//            "${it.text}$author"
//        }
//    }
//
//    override fun creatorId(): Long {
//        return 1L
//    }
//
//    override fun sendStartupMessage(groupId: String, message: String) {
//        val sendMessage = SendMessage()
//        sendMessage.enableMarkdown(true)
//        sendMessage.chatId = groupId
//        sendMessage.text = message
//
//        // Send the message
//        execute(sendMessage)
//    }
//
//
//    override fun onRegister() {
//        super<AbilityBot>.onRegister()
//    }
//}
//
