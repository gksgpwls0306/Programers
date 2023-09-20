import java.util.regex.*;

class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        String pt = "^[0-9]*$";
        answer = Pattern.matches(pt,s)&&(s.length() == 4 || s.length() == 6);
        return answer;
    }
}