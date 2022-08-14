package Tasks.Str

//Given two strings first and second, consider occurrences in some text of the form "first second third", where second comes immediately after first, and third comes immediately after second
//Return an array of all the words third for each occurrence of "first second third".

//Output: ["we","rock"]
fun main() {
    var arr = findOcurrences( "we will we will rock you" ,first = "we", second = "will")
    arr.forEach { print(it + " ") }
}


fun findOcurrences(text: String, first: String, second: String): Array<String> {
    var list =  ArrayList<String>()
    var listAnswer =  ArrayList<String>()
    var str:String = ""
    for (c in text.indices) {

        if (c==0 || text[c] !=' ' && !(c==text.length-1)){
           str  =  str + text[c]
        }else{
            if (str!="") {
                if (c==text.length-1){
                    str+=text[c]
                }
                list.add(str.trim())
            }
            str  = ""
        }
    }
var on = true
    while (on){
    for (slovo in list.indices) {

        if (slovo<list.size-3){

            if (list.get(slovo+1).trim() == first && list.get(slovo+2).trim()==second){
                listAnswer.add(list[slovo+3])
                list.remove(list[slovo]);
                list.remove(list[slovo]);
                list.remove(list[slovo]);
                on = true
                break
            }
        }else{
            on = false
            break
        }
    }

    }

    var join  =  Array<String>(listAnswer.size,{""})

    for (s in join.indices) {
        join[s]=listAnswer.get(s);
    }
    return join


}