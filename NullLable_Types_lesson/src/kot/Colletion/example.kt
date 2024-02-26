package kot.Colletion

fun main() {
    val list = listOf(4,4,2,2,1)

    println(areUnique(list))

}

fun areUnique(list : List<Int>) : Boolean{

    val map = hashMapOf<Int,Int>()
    list.forEach {element ->
        map[element] = map[element]?.plus(1)?:0
    }

    val setMap = map.values.toSet()

    for(i in setMap){
        println(i)
    }

    println( " ${map.size} : " + setMap.size)

    return map.values.size == map.values.toSet().size
}