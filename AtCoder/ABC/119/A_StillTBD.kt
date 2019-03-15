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
    val S = next()
    val s = when {
        S.substring((5..6)).toInt() > 4
                || (S.substring((5..6)).toInt() == 4 && S.substring((8..9)).toInt() > 30) -> {
            "TBD"
        }
        else -> "Heisei"
    }
    println(s)
}

// 入力取得
fun next() = br.readLine()!!
fun nextInt() = next().toInt()
fun nextLong() = next().toLong()
fun listOfString() = next().split(" ")
fun listOfInt() =listOfString().map { it.toInt() }
fun listOfLong() =listOfString().map { it.toLong() }

// 約数のList
fun divisor(value : Long) : List<Long> {
    val max = Math.sqrt(value.toDouble()).toLong()
    return (1..max)
        .filter { value % it == 0L }
        .map { listOf(it, value / it) }
        .flatten()
        .sorted()
}

// 範囲内の素数を取得
// fromだけ指定すると戻り値の個数で素数判定ができる
fun prime(from : Long, to : Long = from) : List<Long> {
    return (from..to).filter { i ->
        val max = Math.sqrt(i.toDouble()).toLong()
        (2..max).all { j ->  i % j != 0L }
    }
}

// 素因数分解
fun decom(value : Long) : List<Long>{
    if (value == 1L) return listOf(1)
    val max = Math.sqrt(value.toDouble()).toLong()
    return prime(2, max).filter { value % it == 0L }
}

// 最大公約数
fun gcd(a : Long, b : Long) : Long {
    return if (a % b == 0L) b else gcd(b, a % b)
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
