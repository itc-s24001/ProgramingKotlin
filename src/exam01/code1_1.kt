package exam01

/**
 * キーボードから数字を入力して、1から入力された数までの
 * FizzBuzz を出力します。
 *
 * FizzBuzz とは
 * 3の倍数のときの Fizz
 * 5の倍数のときに Buzz
 * 3と5の倍数のときに FizzBuzz
 * それ以外のときは 数字をそのまま出力する
 */
fun main() {
    print("数字を入力してください: ")
    val end = readln().toInt()
    for (i in 1..end) {
       val result = if (i % 15 == 0) {
           "FizzBuzz"
       }else if (i % 5 == 0) {
           "Buzz"
       }else if (i % 3 == 0) {
           "Fizz"
       }else{
           "${i}"
       }
        println(result)
    }
}