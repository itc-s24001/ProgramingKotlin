package chap05

import jdk.internal.joptsimple.internal.Messages.message

fun main() {
    val h = 8
    val message1 = "本日働いた時間は、${h}horus"
    val message2 = "このペースで1ヶ月働くと、${h * 30}hours の労働になります。"
    val message3 = "このペースで1年間働くと、${h * 365}hours の労働になります。"

    println(message1)
    println(message2)
    println(message3)

}