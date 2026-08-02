const val START_CONTROL_WEIGHT = 35
const val END_CONTROL_WEIGHT = 100
const val CONTROL_VOLUME = 100
fun main() {
    val category = "'Average'"
    val firstWeight = 20 // вес первого груза
    val firstVolume = 80 // объем первого груза
    val secondWeight = 50 // вес второго груза
    val secondVolume = 100 // объем второго груза
    println("Груз с весом $firstWeight кг и объемом $firstVolume л соответствует категории $category: ${firstWeight > START_CONTROL_WEIGHT && firstWeight <= END_CONTROL_WEIGHT && firstVolume < CONTROL_VOLUME}")
    println("Груз с весом $secondWeight кг и объемом $secondVolume л соответствует категории $category: ${secondWeight > START_CONTROL_WEIGHT && secondWeight <= END_CONTROL_WEIGHT && secondVolume < CONTROL_VOLUME}")
}