fun isVowel(char: Char): Boolean {
    val v = char.lowercaseChar()
    return v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u'
}

fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}