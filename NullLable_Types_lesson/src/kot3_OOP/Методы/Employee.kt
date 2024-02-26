package kot3_OOP.Методы

import java.util.*

class Employee(val name : String , val proffesia : String, val yearStart : Int) {

    val isWork = println("Работаю...")

    val stage : Int
    get() = Calendar.getInstance().get(Calendar.YEAR)-yearStart

    fun stageInf(){
        println("Работает $proffesia уже $stage лет")
    }



}