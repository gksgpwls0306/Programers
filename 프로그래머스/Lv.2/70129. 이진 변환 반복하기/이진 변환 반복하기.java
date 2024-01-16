class Solution {
    public int[] solution(String s) {
        int[] answer = {0,0};
        
        while(s.length() > 1){
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '0'){
                    if(i == s.length() - 1)
                        s = s.substring(0, i);
                    else
                        s = s.substring(0, i) + s.substring(i + 1);
                    answer[1] += 1;
                    i--;
                }
            }
            answer[0] += 1;
            s = Integer.toBinaryString(s.length());
        }
        return answer;
    }
}