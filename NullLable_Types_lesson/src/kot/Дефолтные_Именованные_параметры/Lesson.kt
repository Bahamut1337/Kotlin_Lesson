package kot.Дефолтные_Именованные_параметры

fun main() {
    printInfo(5,2,3)
}

fun printInfo(a : Int , b:  Int = a, c: Int = a){
    println(a*b*c)
}


