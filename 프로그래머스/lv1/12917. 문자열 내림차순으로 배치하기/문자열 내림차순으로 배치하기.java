import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] abc = s.split("");
        Arrays.sort(abc, Collections.reverseOrder());
        for(String i : abc){
            answer += i;
        }
        return answer;
    }
}