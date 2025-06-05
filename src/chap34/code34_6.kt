package chap34

import kotlin.math.sqrt

fun main() {
    val number1 = null
    val number2 = 10

    printCubicSquareRoot(number1)
    printCubicSquareRoot(number2)
}

fun printCubicSquareRoot(num: Int?) {
    // 数を3乗して、平方根を求める
    if (num == null) {
        println("null なのでなにもしない")
        return
    }
    val result = sqrt((num * num * num).toDouble())
    println("${num}を3乗した数の平方根は${result}です。")
}