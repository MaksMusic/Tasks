package Tasks.IntegerTrue

fun main() {

println(judgeSquareSum(1000000000))
}
fun judgeSquareSum(c: Int): Boolean {


    for (i in 0..c) {
        for (j in 0..c) {
            if (  (i*i + j*j) == c) {
                return true
            }
        }
    }
    return false

}
