package chap04

fun main() {
    val a = 10_000_000
    val b: Byte = 0x7f          //16進数
    val c: Byte = 0b001010100   //2進数

    println(a)
    println(b)
    println(c)

    val f = 149_600_000.123f
    val d = 149_600_000.123
    val g = 1.496e8

    println(f)
    println(d)
}