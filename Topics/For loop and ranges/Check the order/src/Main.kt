fun main() {
    val n = readLine()!!.toInt()

    var prev = readLine()!!.toInt()
    var sorted = true
    for (i in 0 until n - 1) {
        val current = readLine()!!.toInt()
        if (current < prev) {
            sorted = false
            break
        }
        prev = current
    }

    println(if (sorted) "YES" else "NO")
}