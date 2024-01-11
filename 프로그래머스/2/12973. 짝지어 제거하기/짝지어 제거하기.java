import java.util.*;

class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        Stack<Character> alpha = new Stack();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(!alpha.empty() && alpha.peek() == c){
                alpha.pop();
                continue;
            }
            alpha.push(c);
        }
        if(alpha.size() == 0)
            return 1;

        return answer;
    }
}