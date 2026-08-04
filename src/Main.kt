fun main() {
    println("Есть ли повреждение корпуса? (Да/Нет)")
    val damage = readln().equals("да", ignoreCase = true)
    println("Введите размер экипажа")
    val crew = readln().toInt()
    println("Введите количество ящиков провизии")
    val provision = readln().toInt()
    println("Введите погодные условия. (Хорошие / Плохие)")
    val isGoodWeather = readln().equals("хорошие", ignoreCase = true)
    println()
    val isNoDamage = !damage
    val hasEnoughCrew = crew in 55..70
    val hasEnoughProvision = provision > 50
    val fullConditions = isNoDamage && hasEnoughCrew && hasEnoughProvision
    val minimumConditions = !isNoDamage && crew == 70 && provision >= 50 && isGoodWeather
    if (fullConditions) {
        println("Все условия соблюдены. Пароход готов к выходу.")
    } else if (minimumConditions) {
        println("Минимальные условия соблюдены. Пароход готов к выходу.")
    } else {
        println("Условия не соблюдены. Выход запрещен!")
    }
}