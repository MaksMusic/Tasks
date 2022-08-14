package Tasks

fun main(){

    var k:(Int,Int)-> String = ::helloJoni
    println(k(7,7).toInt() + k(7,7).toInt())

}

fun helloJoni(x:Int,x2:Int) : String = ("${x+x2}0")