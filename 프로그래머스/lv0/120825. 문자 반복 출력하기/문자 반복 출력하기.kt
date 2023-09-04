class Solution {
    fun solution(my_string: String, n: Int): String {
        var answer: String = ""
        for(i in 0 until my_string.length){
            for(j in 1..n){
                answer += my_string[i]
            }
        }
        return answer
    }
}