import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] arr = (n+"").split("");
        Arrays.sort(arr, Collections.reverseOrder());
        String s = "";
        for(String ss : arr){
            s += ss;
        }
        answer = Long.valueOf(s);
        return answer;
    }
}