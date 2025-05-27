package chap26

import chap25.Person2

fun main() {
    val p = Person(7)
    val p2 = Person("鈴木", "タロウ")
}

class Person(var name: String, var age: Int) {
    init {
        println("プライマリコンストラクタのイニシャライズが呼ばれました。")
        println("指定されたパラメータは $name と $age です。")
    }
    constructor(age: Int): this("名無しさん", age) {
        println("年齢だけを指定するセカンダリコンストラクタのイニシャライズが呼ばれました。")
    }
    constructor(lastName: String, firstName: String): this("$lastName $firstName", 20){
        println("苗字と名前を指定するセカンダリコンストラクタのイニシャライズが呼ばれました。")
    }
}