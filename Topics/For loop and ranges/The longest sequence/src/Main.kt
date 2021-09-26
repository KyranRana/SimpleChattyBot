import kotlin.math.max

fun main() {
    val n = readLine()!!.toInt()

    var prev = Integer.MIN_VALUE

    var seqCount = 0
    var maxSeqCount = 0

    repeat(n) {
        val current = readLine()!!.toInt()
        if (current >= prev) {
            seqCount++
        }
        if (current < prev || it == n - 1) {
            maxSeqCount = max(seqCount, maxSeqCount)
            seqCount = 1
        }
        prev = current
    }

    println(maxSeqCount)
}