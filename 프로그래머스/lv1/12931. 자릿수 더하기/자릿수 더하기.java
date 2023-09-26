import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String[] arr = Integer.toString(n).split("");
        for(String i : arr){
            answer += Integer.valueOf(i);
        }
        return answer;
    }
}