import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int smax = Math.max(sides[0],sides[1]);
        for(int i = smax-Math.min(sides[0],sides[1])+1; i <= smax; i++){
            answer++;
        }
        for(int i = smax+1 ; i < sides[0]+sides[1]; i++){
            answer++;
        }
        return answer;
    }
}