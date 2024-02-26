/*
class Test {

}

fun main() {
    */
/*var s= listOf(9,9,9)
    println(s.fold(1){sum,element-> sum*element})*//*


    var s1 = arrayOf<String>("ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh")
    var s2 = arrayOf<String>("bbbaaayddqbbrrrv")
    println(mxdiflg(s1,s2))
}


fun persistence(num: Int) : Int {
    var strNum = num.toString()
    var s = 0
    while (strNum.length>1){
        strNum = strNum.fold(1){sum,element->sum*element.toString().toInt()}.toString()
        s++
    }
    return s
}

fun mxdiflg(a1:Array<String>, a2:Array<String>):Int {

    return a1.flatMap { s1 -> a2.map { kotlin.math.abs(s1.length - it.length) } }.maxOf { it } ?: -1
}*/
