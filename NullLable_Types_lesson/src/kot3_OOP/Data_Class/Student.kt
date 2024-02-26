package kot3_OOP.Data_Class

class Student(val name: String, val lastName: String, val id: Int) {

    //operator - нужен для того что бы пометить функцию как деструктор шоб можно было вызвать без дата класса эту шнягу
    operator fun component1() = name
    operator fun component2() = lastName
    operator fun component3() = id


    override fun toString(): String {
        return "Student(name='$name', lastName='$lastName', id='$id')"
    }


}