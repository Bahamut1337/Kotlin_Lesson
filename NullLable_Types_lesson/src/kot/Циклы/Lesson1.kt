package kot.Циклы

fun main() {
    val array = arrayOfNulls<Int?>(301)

    for((index,i) in (300..600).withIndex()){
        array[index] = i
    }

    /*for((index,i) in array.withIndex()){
        array[index] = i?.times(2)

    }*/

    for(i in array.size-1 downTo 0 step 5){
        println(array[i])
    }
}
