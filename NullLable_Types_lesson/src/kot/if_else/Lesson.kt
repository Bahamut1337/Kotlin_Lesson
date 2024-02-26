package kot.if_else

fun main() {

    var num = 400

    val food = if(num >= 500){
        num=-500
        "пиццу"
    }else if (num >=200){
        num=-200
        "шаурму"
    }else{
        num=-100
         "доширак"
    }
    println("Вы можете приобрести $food у вас осталось $num")
}