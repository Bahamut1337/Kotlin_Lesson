package kot3_OOP.Generic.Part2

fun main() {
    val list2 : MyList2<String> = MyArrayList<String>()

    for(i in 0..100){
        list2.add2("$i")
    }

    for(i in 0..90){
        list2.removeAt2(0)
    }

    for(i in 0 until list2.size2()){
        println(list2.get2(i))
    }

}