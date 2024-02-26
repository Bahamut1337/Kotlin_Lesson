package kot2.With_Let

var name : String? = "dasdad"

val arrayList : MutableList<Int> ?= mutableListOf()

fun main() {
   /* name?.let {
        if(it.length >5){
            println("adadas")
        }
    }
    if (name?.length?.compareTo(5) == 1){
        println("ssss")
    }*/
  /*  val list = mutableListOf<Int>()
    with(list){
        for (i in 0..1000){
            add((Math.random()*100).toInt())
        }
        println(minOf { it })
        println(maxOf { it })
        println(average())
        println(first())
        println(last())
    }*/
    arrayList?.let {
        with(arrayList){
            for (i in 0..1000){
                add((Math.random()*100).toInt())
            }
            filter { it % 2==0 }.take(100).map { println(it) }
        }
    }

}