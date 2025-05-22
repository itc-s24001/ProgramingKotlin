package chap15

fun main() {
    //code15_6
    for (x in 1..10) {
        if (x % 3 == 0) {
            break
        }
        println("${x}回目の繰り返し処理")
    }
    println("--------------")
    //code15_7
    for (x in 1..10) {
        if (x % 3 == 0) {
            continue
        }
        println("${x}回目の繰り返し処理")
    }
}