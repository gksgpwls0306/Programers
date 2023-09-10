class Solution {
    fun solution(array: IntArray): Int {
        var answer: Int = 0
        var list = MutableList<Int>(1000){0}
        for(i in 0 until array.size){
            list.set(array[i],(list.get(array[i])+1))
        }
        
        var count = 0
        var max = 0
        for(i in 0 until 1000){
            if(list.maxOrNull() == list.get(i)){ //max() 안됌, maxOrNull() 됌
                count++
                max = i
                if(count>1){
                    return -1
                }
            }
        }
        answer = max
        return answer
    }
}