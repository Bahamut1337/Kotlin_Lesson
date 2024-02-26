package kot2.Бесконечные_Последовательности

fun main() {
    val array = (0..1000).toList()
    val employee = array.map {"Employee №$it"}
    val first30 = employee.take(30)//выводит первые 30
    val last30 = employee.takeLast(30)// выводит последние 30
    val drop30 = employee.drop(30)// выводит оставшиеся элементы кроме первых 30
    val dropLast30 = employee.dropLast(30)// выводит оставшиеся элементы кроме последних 30

    for(i in first30){
        println(i)
    }

    val arr = generateSequence (0){ it+2 }//последовательность в которой бесконечно генерируются числа от 0 в шаг +2
    val arrTake = arr.take(10)
    for (i in arrTake){
        println(i)
    }

    val emp = generateSequence ("Сотрудник №1"){
        val index = it.substring(11).toInt()+1
        "Сотрудник №$index"
    }
    val newEmp = emp.take(100)
    for (i in newEmp){
        println(i)
    }

}