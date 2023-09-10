class Solution {
    fun solution(numbers: IntArray): Double {
        var answer: Double = 0.0
        answer = numbers.sum().toDouble()/numbers.size
        return answer
    }
}