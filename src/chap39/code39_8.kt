package chap39

import kotlin.random.Random

fun main() {
    // 関数(ラムダ式)以外のパラメーターと、ラムダ式を同時に渡すときの kotlin 的な書き方
    randomNumberClosure(6) {
        it * 2
    }
    randomNumberClosure(100) {
        val square = it * it
        val cubic = square * it
        cubic
    }

}

fun randomNumberClosure(max: Int, calculator: (Int) -> Int) {
    val targetNumber = Random.nextInt(max + 1)
    val result = calculator(targetNumber)
    println("計算結果: $result")
}