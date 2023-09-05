class Solution {
    fun solution(angle: Int): Int {
        var answer: Int = 1
        if(angle==180)
            return 4
        else if(angle > 90)
            return 3
        else if(angle == 90)
            return 2
        
        return answer
    }
}