import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        int big = Integer.valueOf(arr[0]);
        int small = Integer.valueOf(arr[0]);
        for(int i = 1; i < arr.length; i++){
            big = Math.max(Integer.valueOf(arr[i]),big);
            small = Math.min(Integer.valueOf(arr[i]),small);
            // System.out.println(ss);
        }
        answer = small+ " "+ big;
        return answer;
    }
}