package kot3_OOP.Наследование

abstract class Animal(val name : String,var weight : Int, val habitat : String) {

    abstract fun eat()

    abstract fun run()
}