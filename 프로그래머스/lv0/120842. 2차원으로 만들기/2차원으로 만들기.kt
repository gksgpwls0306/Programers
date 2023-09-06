class Solution {
    fun solution(num_list: IntArray, n: Int): Array<IntArray> {
        var answer: Array<IntArray> = Array(num_list.size/n,{IntArray(n)})
        var num = 0
        for(i in 0 until (num_list.size/n)){
            for(j in 0 until n){
                answer[i][j] = num_list[num]
                num++
            }
        }
        return answer
    }
}