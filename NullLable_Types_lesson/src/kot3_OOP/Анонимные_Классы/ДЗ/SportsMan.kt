package kot3_OOP.Анонимные_Классы.ДЗ

class SportsMan  {
    fun callVodonos(vodonos: Vodonos) {
        vodonos.bringWaret()
    }

    fun invokeWterBoy(bringWater : () -> Unit){
        bringWater()
    }
}