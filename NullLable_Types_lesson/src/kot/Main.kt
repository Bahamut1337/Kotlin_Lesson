package kot

private var string : String ?= null
private var string2 : String ?= "null"
private var string3 : String ?= ""
private var string4 : String ?= null

fun main() {
    val c = (string?.length?:0) + (string2?.length?:0) + (string3?.length?:0) + (string4?.length?:0)
    println(c)
}