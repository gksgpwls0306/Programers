class Solution {
    fun solution(numbers: IntArray, k: Int): Int {
        var answer: Int = 0
        answer = numbers[((k-1) * 2 % numbers.size)]
        return answer
    }
}