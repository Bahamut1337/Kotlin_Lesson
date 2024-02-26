package kot3_OOP.SingleTon

fun main() {
    val db = DataBase
    db.incertData("1")
    db.incertData("2")

    val test = Test()
    test.incertTestData("3")
    test.incertTestData("4")
    for(str in db.data){
        println(str)
    }
}