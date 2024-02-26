package kot3_OOP.Наследование.ДЗ

open class Employee(val name : String, val age : Int) {

    open fun work(){
        println("Работаю")
    }

    override fun toString(): String {
        return "Employee(name='$name', age=$age)"
    }


}