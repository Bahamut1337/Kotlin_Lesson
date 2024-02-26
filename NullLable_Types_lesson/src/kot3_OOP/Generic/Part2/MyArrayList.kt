package kot3_OOP.Generic.Part2

class MyArrayList<T> : MyList2<T> {

    var array2 = arrayOfNulls<Any>(10)
    var size2 = 0

    override fun get2(index: Int): T {
        if (index in 0 until size2){
            array2[index].let { return it as T }
        }else{
            throw IndexOutOfBoundsException()
        }
    }

    override fun add2(element: T) {
      if(size2 >= array2.size){
          array2 = array2.copyOf(array2.size*2)
      }

        array2[size2] = element
        size2++
    }

    override fun removeAt2(index: Int) {
        if(index in 0 until  size2){
            for(i in index until array2.size-1){
                array2[i] = array2[i+1]
            }
            size2--
        }
        else{
            throw java.lang.IndexOutOfBoundsException()
        }
    }

    override fun remove2(element: T) {
        for((index,string) in array2.withIndex())
        {
            if(string == element){
                removeAt2(index)
                return
            }else{
                throw java.lang.IndexOutOfBoundsException()
            }
        }
    }

    override fun size2(): Int {
        return size2
    }


}