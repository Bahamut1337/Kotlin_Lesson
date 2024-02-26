package kot3_OOP.Data_Class.ДЗ

import kot3_OOP.Data_Class.Student

class Adress(val city : String, val street : String, val alley : Int) {

    operator fun component1() = city
    operator fun component2() = street
    operator fun component3() = alley

    fun copy(city : String = this.city, street : String= this.street,  alley : Int= this.alley) : Adress {
        return Adress(city,street,alley)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Adress

        if (city != other.city) return false
        if (street != other.street) return false
        if (alley != other.alley) return false

        return true
    }

    override fun hashCode(): Int {
        var result = city.hashCode()
        result = 31 * result + street.hashCode()
        result = 31 * result + alley
        return result
    }

    override fun toString(): String {
        return "Adress(city='$city', street='$street', alley=$alley)"
    }


}