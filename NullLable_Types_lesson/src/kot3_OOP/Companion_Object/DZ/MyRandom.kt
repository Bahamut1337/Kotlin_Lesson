package kot3_OOP.Companion_Object.DZ

class MyRandom {

    companion object{

        fun randomInt( a: Int , b : Int) = (a..b).random()

        fun randomBoolean() =  randomInt(0,1) > 0

        fun randomDayOfWeek() : String{
            val index = randomInt(1,7)
            var day : String = ""
            when(index){
                1 -> day = "Понедельник"
                2 -> day = "Вторник"
                3 -> day = "Среда"
                4 -> day = "Четверг"
                5 -> day = "Пятница"
                6 -> day = "Суббота"
                7 -> day = "Воскресенье"
            }
            return day
        }


    }

}