package kot2.Создание_своей_функции

fun main() {
    val result = modifyString("Hello world!") { it.uppercase() }
    println(result)

    val arrList = listOf(1,5,2,8,5,2,5,1,0,7,9,4,6)
    modifyArray(arrList, { println(it.sum())})

}

fun modifyString(string: String, modify : (String) -> String) : String{
    return modify(string)
}

inline fun modifyArray(arr: List<Int>, modifyArr: (List<Int>) ->Unit) {
    return modifyArr(arr)
}