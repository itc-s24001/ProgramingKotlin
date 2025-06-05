package chap40

class Person2(val name: String, val age: Int) {
    fun greet() {
        println("${name}です。 ${age}才です。")
        at18year(::moreYearsAt)
    }

    fun greet2() {
        at30year(::moreYearsAt)
    }

    fun moreYearsAt(year: Int): Int {
        return year - age
    }
}

fun at18year(action: (Int) -> Int) {
    println("18歳まで${action(18)}年です。")
}

fun at30year(action: (Int) -> Int) {
    println("30歳まで${action(30)}年です。")
}

fun main() {
    val p1 = Person2("ユミ", 8)
    p1.greet()
    p1.greet2()
    val p2 = Person2("ケンタ", 5)
    p2.greet()
    p2.greet2()
}