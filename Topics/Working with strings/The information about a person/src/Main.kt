fun main() {
    val (firstName, lastName, age) = readLine()!!.split(" ")
    println("${firstName[0]}. $lastName, $age years old")
}