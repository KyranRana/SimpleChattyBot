fun main() {
    val (a, b, n) = Array(3) { readLine()!!.toInt() }
    println((a..b).count { it % n == 0 })
}