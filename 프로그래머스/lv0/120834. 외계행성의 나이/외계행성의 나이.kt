class Solution {
    fun solution(age: Int): String {
        var answer: String = ""
        var aa = age
        val abc = arrayOf("a","b","c","d","e","f","g","h","i","j")
        while(aa > 0){
            var i = aa % 10
            answer = abc[i]+answer
            aa = aa/10
        }
        return answer
    }
}