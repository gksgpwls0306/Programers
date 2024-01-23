import java.util.*;

class Solution {
    public String solution(String number, int k) {
        String answer = "";
        char[] num = number.toCharArray();
        int index = 0;
        
        for(int i = 0; i < num.length - k; i++){
            int max = 0;
            int cnt = i == 0 ? 0 : index - (i - 1);
            while(cnt <= k){
                if(max < Integer.valueOf(num[i + cnt])){
                    max = Integer.valueOf(num[i + cnt]);
                    index = i + cnt;
                    if(max == 9)
                        break;
                    // System.out.println(i+" "+cnt+" "+num[index]);
                }
                cnt++;
            }
            answer += num[index]+"";
            num[index] = '0';
        }
        
        return answer;
    }
}