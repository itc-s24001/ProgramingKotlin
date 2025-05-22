package chap10

fun main() {
    val age: Int = 10

    val range1: IntRange = 0..6
    val range2: IntRange = 7..12
    val range3: IntRange = 13..15

    val flag1 = age in range1
    val flag2 = age in range2
    val flag3 = age in range3

    println("${age}歳の子供は就学前 ${flag1}")
    println("${age}歳の子供は就学前 ${flag2}")
    println("${age}歳の子供は就学前 ${flag3}")
}