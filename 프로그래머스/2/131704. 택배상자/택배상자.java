import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        Stack<Integer> stack = new Stack();
        int num = 1;
        for(int i = 0; i < order.length; i++){
            int target = order[i];
            
            if(stack.isEmpty()){
                while(num < target){
                    stack.push(num);
                    num++;
                }
                num++;
                answer++;
            }else{
                if(stack.peek() == target){
                    stack.pop();
                    answer++;
                }
                else if(stack.peek() < target && num <=target){
                    while(num < target){
                        stack.push(num);
                        num++;
                    }
                    num++;
                    answer++;
                }
                else{
                    break;
                }
            }
        }
        return answer;
    }
}