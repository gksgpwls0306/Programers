import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int size = numbers.length;
        int[] answer = new int[size];
        Arrays.fill(answer, -1);
        Stack<Integer> stack = new Stack();
        for(int i = 0; i < size; i++){
            int x = numbers[i];
            while(!stack.isEmpty() && x > numbers[stack.peek()]){
                answer[stack.pop()] = x;
            }
            stack.push(i);
        }
        return answer;
    }
}