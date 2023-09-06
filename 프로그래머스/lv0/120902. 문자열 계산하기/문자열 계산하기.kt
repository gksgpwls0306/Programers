class Solution {
    fun solution(my_string: String): Int {
        var answer: Int = 0
        var list = my_string.split(" ")
        answer = list[0].toInt()
        for(i in 1 until list.size step(2))
        if(list[i] == "+"){
            answer += list[i+1].toInt()
        }else{
            answer -= list[i+1].toInt()
        }
        return answer
    }
}