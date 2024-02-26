package kot3_OOP.Анонимные_Классы.ДЗ

fun main() {
    val sportsMan = SportsMan()
    sportsMan.callVodonos(object : Vodonos{
        override fun bringWaret() {
            println("на водички папей")
        }
    })

    sportsMan.invokeWterBoy { println("на водички папей") }
}