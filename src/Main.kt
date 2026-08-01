fun main() {
    val num = 3
    var text = ""
    for (i in 1..9) {
        val result = num * i
        text += "$num x $i = ${result}\n"
    }
    println(text)
}