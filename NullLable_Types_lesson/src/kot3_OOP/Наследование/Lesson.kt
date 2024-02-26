package kot3_OOP.Наследование

fun main() {

    val array = mutableListOf<Animal>()

    array.add(Cat(3))
    array.add(Cat(2))
    array.add(Cat(1))
    array.add(Dog(4))
    array.add(Dog(7))

    for(i in array){
        i.run()

        if(i is Cleaner){//что бы самому превести тип к нужному классу нужна написать i as Animal
            i.burk()
        }

    }
}