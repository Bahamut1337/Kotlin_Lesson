package kot3_OOP.Наследование.ДЗ

class Programmer(name : String,age : Int, val porgramm : String) : Employee(name,age) {




    override fun work() {
        println("Пишу код на $porgramm")
    }

    override fun toString(): String {
        return "Programmer(porgramm='$porgramm')"
    }

}