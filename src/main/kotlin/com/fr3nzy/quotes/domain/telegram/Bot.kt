//package com.fr3nzy.quotes.domain.telegram
//
//
//import jakarta.annotation.PostConstruct
//import org.hibernate.sql.Update
//import org.slf4j.LoggerFactory
//import org.springframework.beans.factory.annotation.Value
//import org.springframework.stereotype.Component
//import org.telegram.telegrambots.extensions.bots.commandbot.TelegramLongPollingCommandBot
//import org.telegram.telegrambots.meta.api.methods.send.SendMessage
//import org.telegram.telegrambots.meta.api.objects.Message
//import org.telegram.telegrambots.meta.api.objects.User
//import org.telegram.telegrambots.meta.exceptions.TelegramApiException
//import java.util.concurrent.TimeUnit
//
//
//@Component
//class Bot : TelegramLongPollingCommandBot() {
//    @Value("\${BOT_TOKEN}")
//    val botToken: String? = null
//
//    @Value("\${BOT_NAME}")
//    val botUsername: String? = null
//
//    fun processNonCommandUpdate(update: Update) {
//        val msg: Message = update.getMessage()
//        val chatId: Long = msg.getChatId()
//        val userName = getUserName(msg)
//        logger.info("userName: {}, chatId: {}", userName, chatId)
//        sendMessage(chatId, userName, msg.getText())
//    }
//
//    @PostConstruct
//    @Throws(InterruptedException::class)
//    fun test() {
//        for (i in 0..4) {
//            TimeUnit.SECONDS.sleep(3)
//            sendMessage(201664263L, "aleksey_zhukov", "hello")
//        }
//    }
//
//    init {
//        register(StartCommand("start", "Старт"))
//    }
//
//    private fun getUserName(msg: Message): String {
//        val user: User = msg.getFrom()
//        val userName: String = user.getUserName()
//        return userName ?: java.lang.String.format("%s %s", user.getLastName(), user.getFirstName())
//    }
//
//    fun sendMessage(chatId: Long, userName: String?, text: String?) {
//        val answer = SendMessage()
//        answer.setText(text)
//        answer.setChatId(chatId.toString())
//        try {
//            execute(answer)
//        } catch (e: TelegramApiException) {
//            //логируем сбой Telegram Bot API, используя userName
//        }
//    }
//
//    companion object {
//        private val getenv = System.getenv()
//        private val logger = LoggerFactory.getLogger(Bot::class.java)
//    }
//}