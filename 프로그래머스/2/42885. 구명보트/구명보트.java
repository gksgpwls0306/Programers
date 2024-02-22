import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int max = 0, end = 0;
        Arrays.sort(people);
        
        for(int i = people.length - 1; i >= 0; i--){
            max = people[i];
            if(end > i)
                break;
            max += people[end];
            if(max <= limit){
                end++;
            }
            if(max != 0)
                answer++;
        }
        return answer;
    }
}