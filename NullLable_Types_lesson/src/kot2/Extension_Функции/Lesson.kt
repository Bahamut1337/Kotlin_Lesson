package kot2.Extension_Функции

import kot.Функции.max
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

fun main() {

    val array = arrayListOf<Int>()

    with(array){

    }

    val age = 6

    if(age.isAgeValid()){
        println("valid")
    }

    println(age.isPositive())
}



inline fun<T,R> MyWhith(any: T, operation : T.() -> R) : R{
    return any.operation()
}



fun Int.isAgeValid() = this in 0..100

fun Int.isPositive() = this >= 0

fun Int.isPrime() : Boolean {
    if(this <= 3)return true
    for(i in 2 until  this-1){
        if(this%i != 0) return false
    }
    return true
}