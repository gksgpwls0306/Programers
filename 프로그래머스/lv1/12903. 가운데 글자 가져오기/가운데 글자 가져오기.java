class Solution {
    public String solution(String s) {
        String answer = "";
        int m = s.length()/2;
        if(s.length() % 2 == 0)
            answer = s.charAt(m-1)+""+s.charAt(m); 
        else
            answer = s.charAt(m)+"";
        return answer;
    }
}