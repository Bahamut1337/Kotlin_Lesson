package kot.Colletion

import java.util.ArrayList

fun main() {
    //ВСЕГДА при объявлении листа присваивайте ему тип значения родительского класса а именно List если в будущем планируется не однократное
    // его использование где прийдется данному листу присваивать значения других типов листа.Это называется использование абстрации место реализации

    //По умолчанию базовые интерфейсы колекции: List Set Map - являются не изменяемыми. Что бы сделать их изминяемыми нужно испольщовать приставку Mutable

    //Разница этих листов в том что мутабл листы можно изменять, а обычные только читать, выводить информацию
    val changeList : MutableList<Int> = ArrayList()
    val list: List<Int> = ArrayList()

    //list.add(5)
    changeList.add(5)

    println(changeList[0])

    val array = arrayOfNulls<Int?>(10)


}