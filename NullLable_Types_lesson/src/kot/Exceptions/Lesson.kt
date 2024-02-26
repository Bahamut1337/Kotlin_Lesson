package kot.Exceptions

import java.lang.Exception

fun main() {

}

fun sum (a : String, b :String) : Int{
    return try {
        val numA = a.toInt()
        val numB = b.toInt()
        numA*numB
    }catch (e : Exception){
        0
    }
}