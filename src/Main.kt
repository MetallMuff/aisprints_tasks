fun main() {
    val way = "D2-D4;0"
    val from = way.split("-")
    println(from[0])
    val to = way.split("-", ";")
    println(to[1])
    val moveNum = way.split("-", ";")
    println(moveNum[2])
}