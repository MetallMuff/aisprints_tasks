const val NUMBER_OF_TABLES = 13

fun main() {
    val todayBookedTables = 13
    val tomorrowBookedTables = 9
    val isAvailableToday = todayBookedTables < NUMBER_OF_TABLES
    val isAvailableTomorrow = tomorrowBookedTables < NUMBER_OF_TABLES
    println("Доступность столиков на сегодня: $isAvailableToday\nДоступность столиков на завтра: $isAvailableTomorrow")

}