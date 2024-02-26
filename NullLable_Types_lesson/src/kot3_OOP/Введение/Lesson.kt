package kot3_OOP

import kot3_OOP.Введение.Dog

fun main() {
    val dog = Dog()
    dog.age = -1
    dog.weight = -1
    dog.name = "SIMKA"

    println("Имя: ${dog.name}  Возраст: ${dog.age} Вес: ${dog.weight}")
}