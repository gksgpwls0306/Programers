import java.util.*;

class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String[] num = new String[]{"zero","one","two","three","four","five","six","seven","eight","nine"};
        for(int i = 0; i<10; i++){
            String I= i+"";
            if(numbers.contains(num[i])){
                numbers = numbers.replace(num[i],I);
            }
        }
        answer = Long.parseLong(numbers);
        return answer;
    }
}