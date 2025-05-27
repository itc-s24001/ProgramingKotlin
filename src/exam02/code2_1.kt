package exam02

import kotlin.random.Random

fun main() {
    val dice = Dice()
    println("${dice.name} を振った: ${dice.roll()}")

    val dice20 = Dice("D20",20)
    println("${dice20.name} を振った: ${dice20.roll()}")
}

// Dice という名前でサイコロを表すクラス定義
// 一般的な6面サイコロ以外にも対応したいのでいくつまでの数を出せるか
// コンストラクタでパラメータとして受け取る(デフォルトは6面)
// 持ってるプロパティ
//      - name      => 識別用の名前
//      - number    =>　今の出目
//      - maxNumber => このサイコロの最大目
// メソッド
//      - roll => サイコロを振る
// 乱数生成 -> Random.nextInt()

class Dice(var name: String = "dice", var maxInt: Int = 6){
    var number: Int = 1
    fun roll(): Int {
        number = Random.nextInt(1, maxInt + 1)
        return number
    }
}