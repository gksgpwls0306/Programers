import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = cal(arr);
        return answer;
    }
    private static int[] cal(int[] arr){
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        while(index < arr.length){
            if(stack.isEmpty()){
                stack.push(arr[index]);
                index++;
                continue;
            }
            if(stack.peek() == arr[index]){
                stack.pop();
                index++;
            }else{
                stack.push(arr[index]);
                index++;
            }
        }
        if(stack.size() == 0){
            return new int[]{-1};
        }
        int[] result = new int[stack.size()];
        for(int i = stack.size() - 1 ; i >= 0 ; i--){
            result[i] = stack.pop();
        }
        return result;
    }
}