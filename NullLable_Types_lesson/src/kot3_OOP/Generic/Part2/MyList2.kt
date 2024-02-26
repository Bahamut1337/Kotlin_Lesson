package kot3_OOP.Generic.Part2

interface MyList2<T> {

    fun get2(index: Int) : T
    fun add2(element: T)
    fun removeAt2(index : Int)
    fun remove2(element: T)
    fun size2() : Int

}