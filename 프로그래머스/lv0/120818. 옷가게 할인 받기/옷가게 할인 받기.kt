class Solution {
    fun solution(price: Int): Int {
        var answer: Int = 0
        if(price>=500000){
            answer = (price*0.8).toInt()
        }else if(price>=300000){
            answer = (price*0.9).toInt()
        }else if(price>=100000){
            answer = (price*0.95).toInt()
        }else{
            answer = price
        }
        return answer
    }
}