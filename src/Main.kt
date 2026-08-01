fun main() {
    val num = 3
    var text = ""
    for (i in 1..9) {
        if (text.isEmpty()) {
            text += "$num x $i = ${num * i}"
        } else {
            text += "\n$num x $i = ${num * i}"
        }

    }
    println(text)
}