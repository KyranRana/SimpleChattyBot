fun main() {
    val (a, b) = Array(2) { readLine()!!.toLong() }
    println((a until b).reduce { n1, n2 -> n1 * n2 })
}