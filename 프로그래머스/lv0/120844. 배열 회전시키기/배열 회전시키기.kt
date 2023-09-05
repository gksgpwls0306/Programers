class Solution {
    fun solution(numbers: IntArray, direction: String): IntArray {
        var answer: IntArray = IntArray(numbers.size)
        for(i in 0 until numbers.size){
            if(direction.equals("right")){
                if(i != 0){
                    answer[i] = numbers[i-1]
                }else{
                    answer[0] = numbers[numbers.size-1]
                }
            }else{
                if(i != numbers.size-1){
                    answer[i] = numbers[i+1]
                }else{
                    answer[numbers.size-1] = numbers[0]
                }
            }
        }
        return answer
    }
}