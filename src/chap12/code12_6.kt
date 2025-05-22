package chap12

import kotlin.random.Random

fun main() {
    val score = Random.nextInt(from = 50, until = 100)
    val borderC = 60
    val borderB = 70
    val borderA = 80
    val borderS = 90

    val judge = when (score) {
        in 50..<borderC -> "D"
        in borderC..<borderB -> "C"
        in borderB..<borderA -> "B"
        in borderA..<borderS -> "A"
        else -> "S"
    }
    println("$score の判定結果： $judge")
}