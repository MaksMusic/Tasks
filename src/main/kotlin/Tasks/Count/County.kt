package Tasks.Count

fun main() {
    var arr = intArrayOf(1,2,3,1)
    println(containsDuplicate(arr))
}


fun containsDuplicate(nums: IntArray): Boolean {
    for (numOne in nums.indices) {
        if (numOne < nums.size - 1) {
            for (elementTwo in numOne..nums.size - 1) {
                if (elementTwo < nums.size - 1) {
                    if (nums[numOne] == nums[elementTwo + 1]) {
                        return true
                    }
                }
            }
        } else {

        }
    }
    return false
}


//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
//
//
//
//Example 1:
//
//Input: nums = [1,2,3,1]
//Output: true
//Example 2:
//
//Input: nums = [1,2,3,4]
//Output: false
//Example 3:
//
//Input: nums = [1,1,1,3,3,4,3,2,4,2]
//Output: true