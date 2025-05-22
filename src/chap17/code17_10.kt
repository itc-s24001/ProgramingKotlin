package chap17

fun main() {
    val a = mutableListOf(1, 2, 3)
    //val a: MutableList<Int> = mutableListOf(1, 2, 3)

    //val b = mutableListOf() <- だめ
    val b: MutableList<Int> = mutableListOf()
    val c = mutableListOf<Int>()
}