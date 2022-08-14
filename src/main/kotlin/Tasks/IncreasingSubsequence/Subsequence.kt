package Tasks.IncreasingSubsequence

fun main() {

   println(lengthOfLIS(intArrayOf(10, 9, 2, 5, 3, 7, 101, 18)))


}

fun lengthOfLIS(nums: IntArray): Int {
    var result = 0
    var intArray = IntArray(nums.size)
    for (index in nums.indices) {
        for (index2 in index ..nums.size-1) {
            if (nums[index]<nums[index2]){
                intArray[index]++
            }
        }
    }

    for (i in intArray) {
        if (i>result)
         result = i
    }
    return result

}


