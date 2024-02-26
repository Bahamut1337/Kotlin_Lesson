package kot3_OOP.Методы

class Cat(val name : String, var age: Int, val weight : Float = 0f) {

    fun printInfo(){
        println("Кличка: $name Возраст: $age Вес: $weight")
    }

    val isOld : Boolean
    get() = age >= 12
}