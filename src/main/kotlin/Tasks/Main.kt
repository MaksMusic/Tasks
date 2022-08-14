package Tasks


fun main() {
    test()
    test1()
    var list = ArrayList<String>()
    list+= "k1"
    list+= "k2"
    list+= "k3"
    list+= "k4"
    list+= "k5"
   // nomer2(list,"Joni")
}

fun nomer1 (){
    var i = (1..10).random()
    i = (i.toString() + "0").toInt()
    i = i - i
    println(i+1)
}




fun nomer2(n:ArrayList<String>,name:String){
    n[name.indexOf('i')] = n[name.length - 2]
    println(n)
}


fun  test() {
    val myString = """This is the first line
-This is the second line
    -This is the third line
        -And fourth line
"""
    println(myString.trimMargin("-"))
}



fun test1(){
    val name = "barsik"
    var pad  = name.padStart(8,'#')
    println(pad)
    val last = "developer/alexanderklimov/ru".substringAfter('/') // alexanderklimov.ru
    println(last)
    println(name.decapitalize())

    var l = "eerrttyyuu".zipWithNext()
    println(l)

}