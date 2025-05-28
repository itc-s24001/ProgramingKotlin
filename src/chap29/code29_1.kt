package chap29

fun main() {
    val car1 = Ferrari("赤")
    val car2 = Prius("グレー")
    driveByFerrari(car1)
    driveByPrius(car2)
//    driveByFerrari(car2)  エラー
}

fun driveByFerrari(car: Ferrari) {
    car.drive(100.0)
}

fun driveByPrius(car: Prius) {
    car.drive(100.0)
}