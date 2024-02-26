package kot2.FlatMap

fun main() {
 /*   val revenueByWeek = listOf(
        listOf(4,2,7,4,9),
        listOf(1,5,2,5,6),
        listOf(3,2,9,2,8),
        listOf(6,2,1,1,5)
    )
    val total = revenueByWeek.flatMap { it }.average()

    println(total)*/


    /////////ПРИМЕРЫ СОЗДАНИЯ MAP////////////////

    /*val data = mutableMapOf<String,List<Int>>()
    data["file1"] = listOf(14,15,16,11,22,33)
    data["file2"] = listOf(20,14,53,80,45,10)
    data["file3"] = listOf(1,33,51,505,2,32)*/

    val data = mapOf<String,List<Int>>(
        "file1" to listOf(14,15,16,11,22,33),
        "file2" to listOf(20,14,53,80,45,10),
        "file3" to listOf(1,33,51,50,2,-32)
    )

    val average = data.filter { it.value.all { it>=0 }}.flatMap { it.value }.average()

    println(average)
}