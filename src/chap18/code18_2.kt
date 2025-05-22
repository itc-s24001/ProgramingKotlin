package chap18

fun main() {
    val s: MutableSet<String> = mutableSetOf("あ", "い", "う", "え", "お")
    println(s)
    s.add("か")
    s += "き"
    s += "く"
    println("------------")
    println(s)
}