package chap38

fun main() {
    val c1 = gerTextClosure("さん")
    val c2 = gerTextClosure("くん")
    val c3 = gerTextClosure("ちゃん")

    println(c1("タケシ"))
    println(c2("タケシ"))
    println(c3("タケシ"))
}

fun gerTextClosure(x: String): (String) -> String {
    return fun(name) = name + x
}