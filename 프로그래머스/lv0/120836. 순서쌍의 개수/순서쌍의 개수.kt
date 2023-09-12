class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        var map = HashMap<Int,Int>()
        for(i in 1..n){
            if(n%i==0){
                map.put(i,n/i)
            }
        }
        answer = map.size
        return answer
    }
}