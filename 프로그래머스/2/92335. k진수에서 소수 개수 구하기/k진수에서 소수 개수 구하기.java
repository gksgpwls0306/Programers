import java.util.*;

class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String s = Integer.toString(n, k);
        System.out.println(s);
        String[] arr = s.split("0");
        // ArrayList<String> arr = s.split("0");
        
        for(String ss : arr){
            if(ss.length() > 0){
                Long num = Long.parseLong(ss);
                if(num <= 3){
                    if(num != 1)
                        answer++;
                    continue;
                }
                answer++;
                int limit = (int)Math.sqrt(num);
                for(int i = 2; i <= limit; i++){
                    if(num % i == 0){
                        // System.out.println(num+" "+i+" "+answer);
                        answer--;
                        break;
                    }
                }
            }
        }
        return answer;
    }
}