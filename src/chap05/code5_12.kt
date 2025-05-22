package chap05

import jdk.internal.org.jline.utils.Colors.h

fun main() {
    val message = """|
        |こんにちは世界！
        |私は kotlinに関して勉強しています。
        |kotlinでは、とても簡潔なプログラムを書くことができます。
        |皆さん、一緒にプログラミングを楽しみましょう！
    """.trimMargin()
    println(message)
    println("-----------")
    val message2 = """
        こんにちは世界！
        私は kotlinに関して勉強しています。
        kotlinでは、とても簡潔なプログラムを書くことができます。
        皆さん、一緒にプログラミングを楽しみましょう！
    """.trimIndent()
    println(message2)
}