import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < choices.length; i++){
            int num = choices[i];
            if(num <= 4){
                char c = survey[i].charAt(0);
                map.put(c, map.getOrDefault(c, 0) + 4 - num);
            } else {
                char c = survey[i].charAt(1);
                map.put(c, map.getOrDefault(c, 0) + num - 4);
            }
        }
        
        answer += (map.getOrDefault('R', 0) >= map.getOrDefault('T', 0) ? "R" : "T")
            + (map.getOrDefault('C', 0) >= map.getOrDefault('F', 0) ? "C" : "F")
            + (map.getOrDefault('J', 0) >= map.getOrDefault('M', 0) ? "J" : "M")
            + (map.getOrDefault('A', 0) >= map.getOrDefault('N', 0) ? "A" : "N");
        
        return answer;
    }
}