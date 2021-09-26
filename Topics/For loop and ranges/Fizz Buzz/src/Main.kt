fun main() {
    val (a, b) = Array(2) { readLine()!!.toInt() }

    for (i in a..b) {
        println(when {
            i % 15 == 0 -> "FizzBuzz"
            i % 3 == 0 -> "Fizz"
            i % 5 == 0 -> "Buzz"
            else -> i
        })
    }
}