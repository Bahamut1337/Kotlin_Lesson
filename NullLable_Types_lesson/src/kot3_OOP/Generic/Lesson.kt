package kot3_OOP.Generic

fun main() {

    val list2 : MyList<Int> = MyArray.myListOf(7,1,5,3,6,4)

    /*val list : MyList<Int> = MyArray()
    for(i in 0..100){
        list.add(i)
    }

    for(i in 0..90){
        list.removeAt(0)
    }

    for(i in 0 until list.size()){
        println(list.get(i))
    }*/


    var result = mutableListOf<Int>()

    var curleng = 5
    var curwdth = 3

    while(curleng > 0 && curwdth > 0){

        val min = minOf(curleng,curwdth)

        if(curleng > curwdth) curleng -= min
        else(curleng < curwdth)
            curwdth -=min

        result += min

    }

    println(result)

    val a= "xxccvdssasf"
    val b = "grpglprtuijfiw"

    val s = "Hello"
    var pr = ""

    var c = ""
    var l = a.plus(b).toSortedSet().map { c+=it }



    for((index,str) in s.withIndex()){
        if(index == 0){
            pr += str.toByte().toString()
        }
        else if( index in 2 until s.length-1){
            pr += s[index]
        }else if(index == s.length){
            pr+= s[1]
        }
    }

    println(pr)

}