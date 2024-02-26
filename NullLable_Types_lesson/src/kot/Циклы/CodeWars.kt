//package kot.Циклы
//
//import java.util.regex.Matcher
//import java.util.regex.Pattern
//
//fun main() {
//    val size= 3
//
//
//
//    //ar.forEach { println(it) }
//
//    var arr = Array(size){IntArray(size)}
//
//
//    for(i in 0..size-1){
//        for(j in 0..size-1){
//            arr[i][j] += j
//        }
//    }
//
//
//
//    var arra = Array(3){IntArray(size)}
//
//
//    for(i in 1..size){
//        for(j in 1..size){
//            arra[i-1][j-1] = i*j
//        }
//    }
//
//    for(i in arra){
//        for(j in i){
//            //println(j)
//        }
//    }
//
//    val a = listOf<Int>(9,9,9)
//    println(a.sumOf { it })
//    /*var ass = ASum.findNb(6132680780625)
//    println(ass.toString())
//*/
//
//    //Array(size){i -> IntArray(size){(it + 1) * (i + 1)}.forEach { println(it) }}
//}
//
///*
//
//fun romanian(str : String) : Int {
//
//    var num = 0
//    var lastnum =1000
//    var res =0
//    for(i in 0..str.length-1){
//        when(str[i]){
//            'I'->num=1
//            'V'->num=5
//            'X'->num=10
//            'L'->num=50
//            'C'-> num=100
//            'D'-> num=500
//            'M'-> num=1000
//        }
//
//        if(num <= lastnum) res +=num
//        else res = res + (num - lastnum - lastnum)
//        lastnum = num
//
//    }
//    return res
//}
//*/
//
//
///*object ASum {
//
//    fun findNb(m: Long): Long {
//        var a : Long = 1L
//        var total = 0L
//
//        while(total<m){
//            total += a*a*a
//            a+=1
//            if(total==m){
//                return a-1
//            }
//        }
//
//        return -1
//    }
//}*/
//
///*fun revRot(nums:String, sz:Int): String {
//    val chunks = nums.chunked(sz).filter{it.length == sz}
//    return chunks.map { chunk ->
//        val digit = chunk.map { it.digitToInt()}
//        val sumValue = digit.sumOf { it*it*it }
//        if(sumValue % 2 ==0){
//            chunk.reversed()
//        }else{
//            chunk.drop(1) + chunk[0]
//        }
//    }.joinToString()
//}*/
//
///*fun getCount(str : String) : Int {
//    var list = listOf<Char>('a','e','i','o','u','y','A','E','I','O','U','Y')
//    var count = 0
//    str.map { symbol -> list.map { if(it==symbol) count++ } }
//    return count
//}*/
//
//fun persistence(num: Int) : Int {
//    var strNum = num.toString()
//    var arrayNum = mutableListOf<Char>()
//    for(i in strNum){
//        arrayNum.add(i)
//    }
//    var s = 0
//    while (strNum.length>1){
//        strNum = arrayNum.sumOf { it.toInt() }.toString()
//        s++
//    }
//    return s
//}
//
//fun alphabetWar(fight: String): String {
//    val forces = mapOf('w' to 4, 'p' to 3, 'b' to 2, 's' to 1, 'm' to -4, 'q' to -3, 'd' to -2, 'z' to -1)
//    val result = fight.sumOf { forces.getOrDefault(it, 0) }
//    return when {
//        result > 0 -> "Left side wins!"
//        result < 0 -> "Right side wins!"
//        else -> "Let's fight again!"
//    }
//}



