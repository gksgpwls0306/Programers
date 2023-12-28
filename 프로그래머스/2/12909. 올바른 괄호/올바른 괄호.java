class Solution {
    boolean solution(String s) {
        boolean answer = true;
        if(s.charAt(0) == ')'|| s.charAt(s.length()-1) == '(')
            return false;
        if(s.length() % 2 == 1)
            return false;
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '(')
                count++;
            else
                count--;
            if(count<0)
                return false;
        }
        if(count != 0)
            return false;
        return answer;
    }
}