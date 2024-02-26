package kot3_OOP.Data_Class.ДЗ

fun main() {
    val adress1 = Adress("Киеве","Могилянская", 23)
    val adress2 = adress1.copy()

    println(adress1)
    println(adress2)
    println(adress1.hashCode())
    println(adress2.hashCode())
    println(adress2 == adress1)
    println(adress2 === adress1)

    val (nameCity,nameStreet,numberAlley) = adress1
    println(nameCity)
    println(nameStreet)
    println(numberAlley)
}