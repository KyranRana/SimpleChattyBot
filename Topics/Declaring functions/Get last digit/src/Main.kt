import kotlin.math.abs

fun getLastDigit(n: Int) = abs(n) % 10

/* Do not change code below */
fun main() {
    val a = readLine()!!.toInt()
    println(getLastDigit(a))
}