fun main() {
    val num = 3
    for (i in 1..9) {
        val result = num * i
        println("$num × $i = ${result.toString().padStart(2)}")
    }
}