package kot.`when`

fun main() {
    val indexOfMonth : Int = 3

    val string = when(indexOfMonth){
        12,1,2 ->  "Зима"
        in 3..5 -> "Весна"
        in 6..8 -> "Лето"
        in 9..11 -> "Осень"

        else ->{
            "Не знаем таких"
        }
    }
    println(string)

    val temp = 50

    val state = when{
        temp<100 -> "Жидкое"
        temp>100 -> "Газообразное"
        temp<=0 -> "Твердое"
        else -> "ебанутое"
    }

    println(state)

    val time = 10
    val whetherState : Boolean = true
    val res = when{
        time in 6..20 && whetherState -> "Гулять"
        time in 6..20 && !whetherState -> "Читать книгу"
        else -> "Спать"
    }

    println(res)
}