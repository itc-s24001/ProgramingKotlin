package chap18

fun main() {
    val s: Set<String> = setOf("あ", "い", "う", "え", "お")
    println(s)
    println("----------------")
    for (x in s) {
        println(x)
    }
}