package kot.Функции

fun main() {
    max(1,8)
    println(stringChar("abcsdx"))

    println(sum(1,5,6,1,2))

    val list : MutableList<Int> = arrayListOf(10,5,5,2,1,2,8,0,4,2,4)
    val res = sort(1,6,3,2,8)
    for (i in res){
        println(i)
    }
}

fun max(a: Int, b: Int) =  if(a>b) a else b

fun stringChar(s : String) = s.substring(0,Math.min(5,s.length))

fun sum (vararg numb: Int) : Int{
    var res = 0
    for(i in numb){
        res +=i
    }
    return res
}

fun sort (list : MutableList<Int>) : List<Int> {

    for(i in 1 until list.size) {
        for (j in list.size-1 downTo  i) {
            var k = 0
            if (list[j] < list[j-1]) {
                k = list[j];
                list[j] = list[j-1];
                list[j-1] = k;
            }
        }
    }
    return list
}

fun sort(numbers:Array<Int>) = sort(numbers.toMutableList())
fun sort(vararg i : Int) = sort(i.toMutableList())