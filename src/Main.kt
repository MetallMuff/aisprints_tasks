fun main() {
    println("Есть ли повреждение корпуса? (Да/Нет)")
    val hasDamage = readln().equals("да", ignoreCase = true)
    println("Введите размер экипажа")
    val crew = readln().toInt()
    println("Введите количество ящиков провизии")
    val provision = readln().toInt()
    println("Введите погодные условия. (Хорошие / Плохие)")
    val isGoodWeather = readln().equals("хорошие", ignoreCase = true)
    println()
    val isNoDamage = !hasDamage
    val hasEnoughCrew = crew >= 55 && crew <= 70
    val hasEnoughProvision = provision > 50
    val canDepart = (isNoDamage && hasEnoughCrew && hasEnoughProvision) ||
            (!isNoDamage && crew == 70 && provision >= 50 && isGoodWeather)
    if (canDepart) {
        println("Судно может выйти в рейс")
    } else {
        println("Судно не может выйти в рейс")
    }

}