import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap();
        int answer = 1;
        
        for(String[] clo : clothes){
            map.put(clo[1],map.getOrDefault(clo[1],0)+1);
        }
        
        for(String k : map.keySet()){
            answer *= map.get(k)+1;
        }
        answer--;
        return answer;
    }
}