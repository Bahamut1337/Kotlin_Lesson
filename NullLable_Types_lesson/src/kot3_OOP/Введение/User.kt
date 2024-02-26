package kot3_OOP.Введение

class User {
    public var age : Int =0
    set(value) {
        if(value >= 0){
            field=value
        }

    }

    public var name : String ?= null
    get(){
        return if(field == null){
            ""
        }else{
            field
        }
    }
}