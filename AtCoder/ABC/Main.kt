import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.PrintWriter

val br = BufferedReader(InputStreamReader(System.`in`))
val pw = PrintWriter(System.out)
fun main(args : Array<String>) {
    func()
    pw.flush()
}

fun func() {
    // 回答をここに書く
}

// 入力取得
fun next() = br.readLine()!!
fun nextInt() = next().toInt()
fun nextLong() = next().toLong()
fun listOfString() = next().split(" ")
fun listOfInt() =listOfString().map { it.toInt() }

// 約数のList
fun divisor(value : Int) : List<Int> {
    val max = Math.sqrt(value.toDouble()).toInt()
    return (1..max)
        .filter { value % it == 0 }
        .map { listOf(it, value / it) }
        .flatten()
        .sorted()
}

// 範囲内の素数を取得
// fromだけ指定すると戻り値の個数で素数判定ができる
fun prime(from : Int, to : Int = from) : List<Int> {
    return (from..to).filter { i ->
        val max = Math.sqrt(i.toDouble()).toInt()
        (2..max).all { j ->  i % j != 0 }
    }
}

// 素因数分解
fun decom(value : Int) : List<Int>{
    if (value == 1) return listOf(1)
    val max = Math.sqrt(value.toDouble()).toInt()
    return prime(2, max).filter { value % it == 0 }
}

// 最大公約数
fun gcd(a : Int, b : Int) : Int {
    return if (a % b == 0) b else gcd(b, a % b)
}

// 文字列を入れ替え
fun swap(base : String, a : String, b : String) : String {
    return base.map {
        when (it) {
            a.toCharArray()[0] -> b
            b.toCharArray()[0] -> a
            else -> it.toString()
        }
    }.joinToString()
}

fun println(value : Any) {
    pw.println(value)
}