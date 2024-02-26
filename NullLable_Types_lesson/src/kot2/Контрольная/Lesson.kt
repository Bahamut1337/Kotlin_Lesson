package kot2.Контрольная

import kot.Функции.max

fun main() {
    val data = mapOf(
        "Январь" to listOf(100,100,100,100),
        "Февраль" to listOf(200,200,-190,200),
        "Март" to listOf(300,180,300,100),
        "Апрель" to listOf(250,-250,100,300),
        "Май" to listOf(200,100,400,300),
        "Июнь" to listOf(200,100,300,300)
    )
    val dataFilte = data.filter { it.value.all { it > 0 } }

    val averageWeek = dataFilte.flatMap { it.value }.average()
    val averageMonth = dataFilte.map { it.value.sum()}.average()

    val maxMonth = dataFilte.map { it.value.sum() }.maxOf { it }
    val minMonth = dataFilte.map { it.value.sum() }.minOf { it }

    val maxMonthName = dataFilte.filter  { it.value.sum() == maxMonth }.keys
    val minMonthName = dataFilte.filter { it.value.sum() == minMonth }.keys

    val errorMonth = data.filter { it.value.any { it < 0 } }.keys

    println(averageWeek)
    println(averageMonth)

    println(maxMonth)
    for (i in maxMonthName) {
        println(i)
    }

    println(minMonth)
    for (i in minMonthName){
        println(i)
    }

    for (i in errorMonth){
        println(i)
    }


}