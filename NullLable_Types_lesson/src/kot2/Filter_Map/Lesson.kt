package kot2.Filter_Map

fun main() {
    val listOfNumbers: MutableList<Int> = mutableListOf()

    for (i in 0..99) {
        listOfNumbers.add(i)
    }

    val listOfEvenNumbers = listOfNumbers.filter { it % 2 == 0 }

    /*for(i in listOfEvenNumbers){
        println(i)
    }*/

    val listOfName = mutableListOf<String>()
    listOfName.add("Serega")
    listOfName.add("Andrey")
    listOfName.add("Dima")
    listOfName.add("Natasha")
    listOfName.add("Aleksey")

    val listAName = listOfName.filter { (it.startsWith("A")) }

    for (i in listAName) {
        println(i)
    }


    val numbers = listOf<String>("Dima", "Sasha", "Olya")

    //val doubleNumbers = numbers.map { it -> it*2 }

    val employee = numbers.map { "Employee $it " }

    for (i in employee) {
        println(i)
    }

    val number = mutableListOf<Int>()
    for (i in 0..10) {
        number.add(((Math.random() * 31) - 15).toInt())
    }


    val wtfNumber = number.filter({ it % 5 == 0 || it % 3 == 0 }).map { it * it }.sortedDescending().map { "$it" }

    for (i in wtfNumber) {
        println(i)
    }


    val array = generateSequence(0) { it + 1 }.map { "Сотрудник№$it" }

    val firstEmployees = array.take(10)

    for (employee in firstEmployees) {
        println(employee)
    }
}