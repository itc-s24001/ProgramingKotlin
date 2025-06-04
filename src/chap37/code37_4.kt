package chap37

fun main() {
    val p = fun(x: Double, y: Double): Double = x + y
    val m = fun(x: Double, y: Double): Double = x - y
    printRandomValuesCalculation(p)
    printRandomValuesCalculation(m)
}