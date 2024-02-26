package kot2.Lambda

fun main() {
    val sum :  (Int, Int) -> Int = {a, b  -> a*b}
    println(sum(2,4))

    val square : (Int) -> Unit = { println(it*it)}
    square(5)

    val tinagle : (Int, Int) -> Int = {a,b -> 2*(a+b)}
    val name : (String) -> Unit = { println("Привет $it")}

    val array = arrayOf(5,6,1,2,6,3)
    val sort : (Array<Int>) -> Array<Int> = {
        for(i in it.size-2 downTo 0){
            for(j in 0..i){
                var k = 0
                if(it[j] < it[j+1]){
                    k = it[j]
                    it[j] = it[j+1]
                    it[j+1] = k
                }
            }
        }
        it
    }

    val sortedArray = sort(array)

    for(i in sortedArray){
        println(i)
    }


}