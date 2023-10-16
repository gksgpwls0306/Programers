class Solution {
    public int solution(String s) {
        int answer = 0;
            System.out.println(s.length());
        for(int i = 0; i < s.length(); i++){
            char init = s.charAt(i);
            int firstNum = 1;
            int secondNum = 0;
            if(i == s.length()-1){
                answer++;
                break;
            }
            for(int j = i+1; j < s.length(); j++){
                if(s.charAt(i) != s.charAt(j))
                    secondNum++;
                else
                    firstNum++;
                if(firstNum == secondNum){
                    answer++;
                    i += firstNum*2-1;
                    break;
                }else if(j == s.length()-1){
                    answer++;
                    return answer;
                }
            }
        }
        return answer;
    }
}