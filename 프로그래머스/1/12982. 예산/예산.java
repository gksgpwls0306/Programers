import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        int max = 0;
        for(int i : d){
            max += i;
            System.out.println(max);
            answer++;
            if(max > budget){
                answer--;
                break;
            }
        }
        return answer;
    }
}