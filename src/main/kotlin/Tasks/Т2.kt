package Tasks

fun main() {
    var arrayN1 = intArrayOf(2, 7, 1,11, 15)
    for(i in algoritms(arrayN1,16)){
        print("$i ")
    }





}

fun algoritms(arr: IntArray, answer: Int): Array<Int> {
    var arrReturn = arrayOf(-1, -1)
    for (i in arr.indices) {
        for (j in arr.indices) {
            if (arr[i] + arr[j] == answer) {

                arrReturn = arrayOf(i, j)
            }
        }
    }
    return arrReturn
}




