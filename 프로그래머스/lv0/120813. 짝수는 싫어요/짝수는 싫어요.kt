class Solution {
    fun solution(n: Int): IntArray {
        var answer: IntArray = IntArray(when{n%2 == 0 -> n/2 else -> n/2+1}){0}
        var index = 0
        for(i in 1..n step(2)){
            answer[index] = i
            index++
        }
        return answer
    }
}