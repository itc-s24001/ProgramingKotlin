package chap38

fun main() {
    val closureA = getCountClosure()
    val closureB = getCountClosure()
    println("クロージャーAが返した値 = ${closureA()}")
    println("クロージャーAが返した値 = ${closureA()}")
    println("クロージャーAが返した値 = ${closureA()}")
    println("クロージャーBが返した値 = ${closureB()}")
    println("クロージャーBが返した値 = ${closureB()}")
    println("クロージャーAが返した値 = ${closureA()}")
}

fun getCountClosure(): () -> Int {
    var num = 0
    return fun() = ++num
}