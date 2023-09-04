class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer: IntArray = intArrayOf(0,0)
        for(i in 0 until num_list.size){
            if(num_list[i] % 2 == 0){
                // println(num_list[i])
                answer[0]++
            }else{
                answer[1]++
            }
        }
        return answer
    }
}