fun main() {
    val num = 3
    var text = ""
    for (i in 1..9) {
        text += "$num x $i = ${num * i}\n"
    }
    println(text)
}