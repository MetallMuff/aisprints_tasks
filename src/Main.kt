fun main() {
    val day = 5
    val isHandsAndPress = day % 2 == 1
    val isLegsAndBack = day % 2 == 0
    println(
        "Упражнения для рук:".padEnd(25) + "$isHandsAndPress\n" +
        "Упражнения для ног:".padEnd(25) + "$isLegsAndBack\n" +
        "Упражнения для спины:".padEnd(25) + "$isLegsAndBack\n" +
        "Упражнения для пресса:".padEnd(25) + "$isHandsAndPress"
    )


}