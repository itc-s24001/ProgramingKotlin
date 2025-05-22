package exam01

import kotlin.random.Random
import kotlin.random.nextInt

/**
 * お釣りの金種計算
 * ランダムで 100 〜 9000 の数値生成
 * 支払う金額をキーボードから入力
 * お釣りを計算して、金種ごとにその枚数出力する
 * トータルの枚数は最小
 * 支払う金額が足りない場合は、「足りません」と出力
 */

fun main() {
    val price = Random.nextInt(100..9000)
    println("商品価格: $price 円")

    print("支払う金額を入力してください: ")
    val payment = readln().toInt()

    if (payment < price) {
        println("足りません")
        return
    }

    var change = payment - price
    println("お釣り: $change 円")

    val denominations = listOf(5000, 1000, 500, 100, 50, 10, 5, 1)

    for (coin in denominations) {
        val count = change / coin
        if (count > 0) {
            println("${coin}円 x $count 枚")
            change %= coin
        }
    }
}