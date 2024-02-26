package kot3_OOP.Companion_Object

class Calc {

    companion object{
        fun square(a : Int) : Int{
            return a*a
        }

        fun sqrt(b : Double) : Double {
            var res = 0
            if(b < 0 ){
                return 0.0
            }else{
                for( i in 0 until b.toInt()){
                    if( i*i == b.toInt()){
                        res = i
                        return res.toDouble()
                    }
                }
            }
            return res.toDouble()
        }

        const val PI = 3.14
        fun lenghOfCircle(radius : Float) = 2 *PI * radius
    }



}