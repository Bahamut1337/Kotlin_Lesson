package kot2.ZIP

fun main() {
  /*  val phone = mutableListOf<Long>()
    val name = mutableListOf<String>()

    for (i in 0..1000){
        name.add("Имя $i")
        phone.add(380_00_000_00_00 + (Math.random()*1_000_000_000).toLong())
    }

    val users = name.zip(phone)//метод zip объединяет массивы друг с другом

    for (i in users){
        println("${i.first}: номер телефона: ${i.second}")
    }*/

    val pepole = listOfNotNull("Sasha Gorodskoy","Sergei Ivanov", "Alex Petrov", "Sam Fox")
    val nameP = pepole.map {
        it.substringBefore(' ')
    }
    val nameF = pepole.map {
        it.substringAfter(' ')
    }

    val newPeople = nameP.zip(nameF)
    for(i in newPeople){
        println("Имя:${i.first} Фамилия:${i.second}")
    }
}