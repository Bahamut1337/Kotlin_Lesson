package kot3_OOP.SingleTon

import javax.xml.crypto.Data

//Вот так вот создается SingleTon, а точнее объект который имеет только 1 экземпляр и к нему можно обращаться с любого класса
object DataBase {

    val name = "main.db"
    val version = 1
    val data = mutableListOf<String>()

    fun incertData( strt : String){
        data.add(strt)
    }

}


/*class DataBase private constructor(){

    val name = "main.db"
    val version = 1
    val data = mutableListOf<String>()

    fun incertData( strt : String){
        data.add(strt)
    }

    companion object {
        var db : DataBase ? = null
        fun getInstance(): DataBase {
            db?.let { return it }

            val instance = DataBase()
            db = instance
            return instance
        }
    }
}*/
