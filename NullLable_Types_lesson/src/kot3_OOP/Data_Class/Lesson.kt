package kot3_OOP.Data_Class




fun main() {
    val student1 = Student("Саня","Санчоус",55)
    val student2 = student1.copy()
    println(student1)
    println(student2)
    println(student1.hashCode())
    println(student2.hashCode())
    println(student1 == student2)
    println(student1 === student2)


    ////ДИСТРУКТОР////
    ///так можно из обьекта получить набор переменных. Конструктор же наоборот из набора переменных делает объект

    /*val(name,lastName,id) = student1
    println(name)
    println(lastName)
    println(id)*/
}

fun Student.copy(name : String = this.name, lastName : String = this.lastName, id : Int = this.id) : Student{
    return Student(name,lastName,id)
}
