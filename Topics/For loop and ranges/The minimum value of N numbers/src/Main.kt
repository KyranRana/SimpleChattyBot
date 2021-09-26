import kotlin.math.min

fun main() {
    val n = readLine()!!.toInt()

    var minN = Integer.MAX_VALUE

    repeat(n) {
        minN = min(readLine()!!.toInt(), minN)
    }

    println(minN)
}