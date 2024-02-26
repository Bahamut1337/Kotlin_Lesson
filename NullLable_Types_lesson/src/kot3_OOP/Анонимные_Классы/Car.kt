package kot3_OOP.Анонимные_Классы

class Car(override var name : String = "Машина") : Transport(name)  {
    override fun drive() {
        println("ТАПОК В ПОЛ И ГГГЕНЬ")
    }

    fun startEngine() : Boolean{
        println("Запускаю двигатель")
        return true
    }
}