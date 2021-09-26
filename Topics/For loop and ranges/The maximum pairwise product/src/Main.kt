import kotlin.math.max

fun main() {
    val n = readLine()!!.toInt()

    var maxN = Integer.MIN_VALUE
    var secondMaxN = Integer.MIN_VALUE

    repeat(n) {
        val current = readLine()!!.toInt()

        if (current < maxN) {
            secondMaxN = max(current, secondMaxN)
        } else {
            secondMaxN = maxN
            maxN = current
        }
    }

    println(if (n > 1) maxN * secondMaxN else maxN)
}