import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        Stack<String> stack = new Stack();
        stack.push(words[0]);
        
        for(int i = 1; i < words.length; i++){
            if(stack.contains(words[i])){
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            }
            if(stack.peek().charAt(words[i - 1].length() - 1) != words[i].charAt(0)){
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            }
            stack.push(words[i]);
        }
        System.out.println("Hello Java");

        return answer;
    }
}