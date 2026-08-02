const val HUMIDITY = 20
const val MIN_HUMIDITY_FOR_GROWTH = 20
const val SEASON = "winter"


fun main() {
    val isSunny = true // погода сегодня : солнечно
    val isTentOpen = true // тент: открыт
    val winter = "winter"
    val isNotWinter = SEASON != winter
    val hasEnoughHumidity = HUMIDITY == MIN_HUMIDITY_FOR_GROWTH
    println(
        "Благоприятные ли условия сейчас для роста бобовых?" +
                " ${isSunny && isTentOpen && hasEnoughHumidity && isNotWinter}"
    )
}