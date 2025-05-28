package chap27

class Ferrari(c: String) : Car(c)

fun main() {
    val car = Ferrari("赤")
    car.drive(5.0)
    car.drive(10.0)
}