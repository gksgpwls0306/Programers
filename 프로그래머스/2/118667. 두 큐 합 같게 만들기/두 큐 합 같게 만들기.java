import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        long num1 = 0;
        long num2 = 0;
        long diff = 0;
        for(int i = 0; i < queue1.length; i++){
            num1 += queue1[i];
            num2 += queue2[i];
        }
        diff = (num1 + num2) / 2;
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();        
        for(int i = 0; i < queue1.length; i++) {
            q1.add(queue1[i]);            
            q2.add(queue2[i]);
        }
        while(num1 != num2) {
            if(answer > (queue1.length + queue2.length) * 2)
                return -1;
            int val = 0;
            if(num1 < num2) {
                val = q2.poll();
                q1.add(val);
                num1 += (long) val;
                num2 -= (long) val;
            }else if(num1 > num2){
                val = q1.poll();
                q2.add(val);
                num1 -= (long) val;
                num2 += (long) val;
            }else{
                return answer;
            }
            answer++;
        }
        return answer;
    }
}