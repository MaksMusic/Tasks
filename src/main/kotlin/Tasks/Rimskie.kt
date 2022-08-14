package Tasks

fun main() {
    var res = nn("III")
    println(res)
}


fun nn(s: String): Int {
    var c = s.toCharArray()
    var arr = arrayListOf<Int>()
    var result = 0
    for (i in c) {
        when (i) {
            'I' -> arr.add(1)
            'V' -> arr.add(5)
            'X' -> arr.add(10)
            'L' -> arr.add(50)
            'C' -> arr.add(100)
            'D' -> arr.add(500)
            'M' -> arr.add(1000)
        }
    }
    for (i in arr.indices) {
        if (i > 0 && arr[i] > arr[i - 1]) {
            result += arr[i] - arr[i - 1]
        } else if (i > 0 && arr[i] == arr[i - 1]) {
            result += arr[i]
        } else {
            if (i == arr.size - 1) {
                result += arr[i]
            } else {
                if (arr[i] > arr[i + 1]) {
                    result += arr[i]
                } else if (arr[i] == arr[i + 1]) {
                    result += arr[i]
                }
            }
        }
    }

    return if (result != 0) result else -1
}

