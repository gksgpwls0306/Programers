import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        my_string = my_string.toLowerCase();
        char[] my = my_string.toCharArray();
        Arrays.sort(my);
        answer = new String(my);
        return answer;
    }
}