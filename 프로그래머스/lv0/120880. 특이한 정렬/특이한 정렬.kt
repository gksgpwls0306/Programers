import kotlin.math.abs

class Solution {
    fun solution(numlist: IntArray, n: Int): IntArray {
        val arr = ArrayList<Int>()
        for (element in numlist) {
            arr.add(Integer.valueOf(element))
        }

        arr.sortWith { a, b ->
            val absA = abs(a - n)
            val absB = abs(b - n)
            if (absA == absB) {
                if (a > b) {
                    -1
                } else {
                    1
                }
            } else {
                absA - absB
            }
        }

        val answer = IntArray(numlist.size)
        for (i in arr.indices) {
            answer[i] = arr[i]
        }
        return answer
    }
}