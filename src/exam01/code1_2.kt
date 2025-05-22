package exam01

/**
 * 映画館の料金計算プログラム
 * シニアｰ>一般ｰ>子供 の順で人数を入力
 * 一人あたりの料金は シニア: 1,300円 一般: 2,000円 子供: 1,000円
 * 10名以上の場合 各200円引き
 */

fun main() {
    val seniorPrice = 1300
    val generalPrice = 2000
    val childPrice = 1000

    print("シニアの人数を入力してください: ")
    val senior = readln().toInt()
    print("一般の人数を入力してください: ")
    val general = readln().toInt()
    print("子供の人数を入力してください: ")
    val child = readln().toInt()

    val totalPeople = senior + general + child

    val discount = if (totalPeople >= 10) 200 else 0
    val totalCost = (senior * (seniorPrice - discount)) +
            (general * (generalPrice - discount)) +
            (child * (childPrice - discount))

    println("合計人数: $totalPeople 人")
    println("合計料金: ${totalCost}円")
}