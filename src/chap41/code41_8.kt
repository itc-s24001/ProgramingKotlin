package chap41

class Box3<L, C>(val label:L? = null, content:C? = null) {

}

fun main() {
    val box3 = Box3("ラベル", 123)
}