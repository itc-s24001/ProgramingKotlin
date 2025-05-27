package chap25

fun main() {
    val p = Person("タケシ", 5)
    p.greet()
//    p.name = "Hoge"
//    p.greet()
    val p2 = Person(name = "ケンタ", age = 8)
    p2.greet()
    val p3 = Person(name = "ユミ")
    p3.greet()
    val p4 = Person(age = 7)
    p4.greet()

}
class Person(var name: String = "名無しさん", var age: Int = 0) {
    fun greet() {
        println("${name}です。${age}才です")
    }
}