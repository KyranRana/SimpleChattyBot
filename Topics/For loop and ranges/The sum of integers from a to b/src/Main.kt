fun main() {
    val (a, b) = Array(2) { readLine()!!.toInt() }
    println((a..b).sum())
}