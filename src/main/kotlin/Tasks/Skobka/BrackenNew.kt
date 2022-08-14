package Tasks.Skobka

fun main() {
    println(isValid("({})"))

}


 fun isValid(s: String): Boolean {
    var strArr = ArrayList<Char>()
    var mass = s.toCharArray()


    for (i in mass.indices) {
        if (mass[i] == '(' || mass[i] == ')' || mass[i] == '{' || mass[i] == '}' || mass[i] == '[' || mass[i] == ']') {
            strArr.add(mass[i])
        }
    }
     var btn = true //{[}
     while (btn){

         if (strArr.isEmpty()){
             return true
         }

   // for (element in strArr.indices) {
        var element = 0
        while (element < strArr.size ){

        if (element<strArr.size-1){

            when(strArr[element]){
                '{' -> {
                    if (strArr[element+1] == '}' ){
                        strArr.removeAt(element)
                        strArr.removeAt(element)
                        btn  = true
                        element = strArr.size+1

                    }else{
                        btn = false
                    }
                }
                '(' -> {
                    if (strArr[element+1] == ')' ){
                        strArr.removeAt(element)
                        strArr.removeAt(element)
                        btn  = true
                        element = strArr.size+1
                    }else{
                        btn = false
                    }
                }
                '[' -> {
                    if (strArr[element+1] == ']' ){
                        strArr.removeAt(element)
                        strArr.removeAt(element)
                        btn  = true
                        element = strArr.size+1

                    }else{
                        btn  = false
                    }
                }
            }



        }else{
            return false

        }
            element++
    }
 }
if (strArr.isEmpty()){
    return true
}else{
    return false
}

}