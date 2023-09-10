class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer: IntArray = IntArray(num_list.size)
        var index = 0
        for(i in num_list.size-1 downTo 0){
            answer[index] = num_list[i]
            index++
        }
        return answer
    }
}