package com.fr3nzy.webparser

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


@SpringBootApplication
class WebParserApplication

fun main(args: Array<String>) {
    runApplication<WebParserApplication>(*args)
    val tagList = listOf(
        "quote-container quote-large",
        "quote-container quote-middle",
        "quote-container quote-normal"
    )
    val first =
        ""
    val urlPattern =
        ""

    val quotes: MutableList<Quote> = mutableListOf()

    (2..10).forEach {
        val doc: Document = Jsoup.connect("$urlPattern$it").get()
        println("Page $it")
        var countElementsByPage = 0
        tagList.forEach {
            doc.getElementsByClass(it).forEach {
                countElementsByPage++
                var bookAuthor: String?
                try {
                    bookAuthor = it.getElementsByClass("quote-book-info").first()!!
                        .getElementsByClass("quote-book-author").first()!!.select("a").first()!!.html()
                        .replaceTrash()
                } catch (e: Exception) {
                    try {
                        bookAuthor = it.getElementsByClass("quote-book-info").first()!!
                            .getElementsByClass("quote-book-author").first()!!.select("span").first()!!.select("a")
                            .first()!!.html()
                            .replaceTrash()
                    } catch (e: Exception) {
                        bookAuthor = null
                    }
                }
                quotes.add(
                    Quote(
                        text = it.getElementsByClass("quote-text").first()!!.child(0).html().replaceTrash()
                            .replaceCapital(),
                        originalText = it.getElementsByClass("quote-text").first()!!.child(0).html().replaceTrash(),
                        bookAuthor = bookAuthor,
                        bookName = it.getElementsByClass("quote-book-info").first()!!
                            .getElementsByClass("quote-book-name").first()!!.html().replaceTrash()

                    )
                )
            }
        }
        println("Elements per page $countElementsByPage")
        println("--------------------------------")
        quotes.sortedBy { it.text }.forEach {
            println(it.text)
//                println(it.originalText)
//                println(it.bookAuthor)
//                println(it.bookName)
//                println("--------------------------------")
        }
    }

    println("Total quotes: ${quotes.size}")
    println()
}

fun String.replaceTrash(): String {
    val trim = replace("</?.*?>".toRegex(), "").replace("&nbsp;", " ").replace("\n", "").replace("…", "...").trim()
    val s = trim.substring(0, 1).uppercase() + trim.substring(1)
    return s
}

fun String.replaceCapital(): String {
    if (this.toCharArray()[1].isUpperCase()) {
        println("----REPLACEMENT----")
        println("${this.toCharArray()[0]}${this.toCharArray()[1]}${this.toCharArray()[2]}")
        val new = mutableListOf<Char>()
        val lowercase = this.lowercase()
        val formated = lowercase.substring(0, 1).uppercase() + lowercase.substring(1)
        formated.forEachIndexed { index, c ->
            if (index > 3) {
                if (formated[index - 2] == '.') {
                    new += (c.uppercase().first())
                } else {
                    new += c
                }
            } else {
                new += c
            }
        }
        return new.joinToString("")
    }
    return this
}
