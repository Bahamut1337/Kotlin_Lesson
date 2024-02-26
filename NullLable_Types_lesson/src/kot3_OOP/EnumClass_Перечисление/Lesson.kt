package kot3_OOP.EnumClass_Перечисление

import java.time.Year

fun main() {
    val nameYear = PartOfYears.AUTUMN

    when(nameYear){
        PartOfYears.AUTUMN -> println(nameYear.temperature)
        PartOfYears.SPRING -> println(nameYear.temperature)
        PartOfYears.SUMMER -> println(nameYear.temperature)
        PartOfYears.WINTER -> println(nameYear.temperature)
    }
}