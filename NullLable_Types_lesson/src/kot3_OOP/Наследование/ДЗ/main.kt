package kot3_OOP.Наследование.ДЗ

fun main() {

    val arrayList = mutableListOf<Employee>()

    arrayList.add(Employee("Дима",18))
    arrayList.add(Employee("Саня",32))
    arrayList.add(Programmer("Оля",22,"PHP"))
    arrayList.add(Employee("Маша",26))
    arrayList.add(Programmer("Коля",31, "Java"))

    for (i in arrayList){
       i.work()
    }


}