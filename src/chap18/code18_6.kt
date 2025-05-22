package chap18

fun main() {
    // コード18_5
    val x = mutableListOf("あ", "い", "う", "え", "お")
    println("コレクションの要素数: ${x.count()}")
    println(x)
    x += "あ"
    x += "あ"
    x += "あ"
    println("コレクションの要素数: ${x.count()}")
    println(x)
    println("------------------------")

    // コード18_6
    val y = mutableSetOf("あ", "い", "う", "え", "お")
    println("コレクションの要素数: ${y.count()}")
    println(y)
    y += "あ"
    y += "あ"
    y += "あ"
    println("コレクションの要素数: ${y.count()}")
    println(y)
}