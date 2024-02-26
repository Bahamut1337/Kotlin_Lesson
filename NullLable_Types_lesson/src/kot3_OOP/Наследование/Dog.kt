package kot3_OOP.Наследование

class Dog(weight : Int) : Animal("Собака", weight,"Суша"), Cleaner {

    override fun eat() {
        println("кушаю куку . . . рузу")
    }

    override fun run() {
        println("бегу сделать кусь за жопу")
    }

    override fun burk() {
        println("ГАВ ГАВ ГАААВ")
    }
}