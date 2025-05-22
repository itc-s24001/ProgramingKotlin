package chap21

fun main() {
    grtTimes2(2, 3, 4)
}
fun grtTimes2(x: Int, y: Int, z: Int) {
    println("パラメータとして、$x と $y と $z を受け取りました。")
    println("これらの値を全部掛け算した答えは ${x * y * z} です。")
}