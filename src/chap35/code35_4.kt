package chap35

class Person2(val name: String, val myNumber: Int) {
    override fun equals(other: Any?): Boolean {
        return (other != null
                && other is Person2
                && other.name == name
                && other.myNumber == myNumber)
    }
}

fun main() {
    val p1 = Person2("タケシ", 1234)
    val p2 = Person2("タケシ", 1234)
    println("p1のハッシュコード: ${p1.hashCode()}")
    println("p2のハッシュコード: ${p2.hashCode()}")
    if (p1 == p2) {
        println("二人は同一人物")
    }else {
        println("二人は別人")
    }

    val textSet = setOf("あいうえお", "かきくけこ", "あいうえお")
    println("textSet: $textSet")
    val person2Set = setOf(p1, p2)
    println("person2Set: $person2Set")
}