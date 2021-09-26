fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    val d = readLine()!!.toInt()
    val v = readLine()!!.toInt()

    println(v in a..b || v in c..d)
}