class Solution {
    fun solution(quiz: Array<String>): Array<String> {
        var answer: Array<String> = Array<String>(quiz.size){"O"}
        for(i in 0 until quiz.size){
            var list = quiz[i].split(" ")
            if(list[1]=="+" && list[0].toInt()+list[2].toInt() == list[4].toInt()||
                    list[1]=="-" && list[0].toInt()-list[2].toInt() == list[4].toInt()){
                answer[i] = "O"
            }else if(list[1]=="+" && list[0].toInt()+list[2].toInt() != list[4].toInt()||
                    list[1]=="-" && list[0].toInt()-list[2].toInt() != list[4].toInt()){
                answer[i] ="X"
            }
            
        }
        return answer
    }
}