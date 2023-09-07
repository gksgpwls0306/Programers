class Solution {
    fun solution(rsp: String): String {
        var answer: String = ""
        var list = rsp.split("")
        for( i in 1..rsp.length){
            // System.out.println(list)
            if(list[i] == "2") {
                System.out.print(list[i]+" ")
                answer += "0"
            }
            else if(list[i] == "0") {
                System.out.print(list[i]+" ")
                answer += "5"
            }
            else {
                System.out.print(list[i]+" ")
                answer += "2"
                // System.out.println(list[i])
            }
            System.out.println(answer)
        }
        return answer
    }
}