package kot3_OOP.Методы

class Lesson {

}

fun main() {

   /* val cat = Cat("Барсик", 13,3f)
    cat.printInfo()

    println(cat.isOld)

    cat.age = 10

    println(cat.isOld)*/

    val emp = Employee("Димас", "Строить из себя хуй пойми что", 2015)

    emp.stageInf()
    emp.allInfo()

}

fun Cat.isOld2() = age  >= 12

fun Employee.allInfo() = println("Имя: $name Должность: $proffesia Год начала работы: $yearStart")