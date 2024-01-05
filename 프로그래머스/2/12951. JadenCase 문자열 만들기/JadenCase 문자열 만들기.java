class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        for(String ss : arr){
            if(ss.length() == 0){
                answer += " ";
                continue;
            }
            else{
                answer += ss.substring(0,1).toUpperCase();
                answer += ss.substring(1).toLowerCase();
                answer += " ";
            }
        }
        if(s.substring(s.length()-1).equals(" "))
            return answer;
        answer = answer.substring(0, answer.length()-1);
        return answer;
    }
}