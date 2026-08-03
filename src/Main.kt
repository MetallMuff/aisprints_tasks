const val HUMIDITY = 22
const val MIN_HUMIDITY_FOR_GROWTH = 20
const val SEASON = "summer"
const val UNSUITABLE_SEASON = "winter"

fun main() {
    val isSunny = true // погода сегодня : солнечно
    val isTentOpen = true // тент: открыт
    val isNotWinter = SEASON != UNSUITABLE_SEASON
    val hasEnoughHumidity = HUMIDITY >= MIN_HUMIDITY_FOR_GROWTH
    val isGoodConditions = isSunny && isTentOpen && hasEnoughHumidity && isNotWinter
    if (isGoodConditions) {
        println("Благоприятные условия для посадки!")
    } else {
        println("Неблагоприятные условия для посадки!")
    }

}