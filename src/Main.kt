const val HUMIDITY = 20
const val SEASON = "winter"

fun main() {
    val isSunny = true // погода сегодня : солнечно
    val isTentOpen = true // тент: открыт
    val isNotWinter = SEASON != "winter"
    println(
        "Благоприятные ли условия сейчас для роста бобовых?" +
                " ${isSunny && isTentOpen && HUMIDITY >= 20 && isNotWinter}"
    )


}