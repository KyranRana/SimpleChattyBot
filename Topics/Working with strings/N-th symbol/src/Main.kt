fun main() {
    val string = readLine()!!
    val index = readLine()!!.toInt()

    println("Symbol # $index of the string \"$string\" is '${string[index - 1]}'")
}