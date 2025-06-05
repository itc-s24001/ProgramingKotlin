package chap39

import kotlin.random.Random

fun main() {
    val ramdomSuffix = nameString()
    println(ramdomSuffix("タケシ"))
    println(ramdomSuffix("タケシ"))
    println(ramdomSuffix("タケシ"))
    println(ramdomSuffix("タケシ"))
}

fun nameString(): (String) -> String {
    return {
        val randomNumber = Random.nextInt(100)
        it + randomNumber
    }
}