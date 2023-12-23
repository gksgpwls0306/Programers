import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        HashMap<Integer, Integer> forward = new HashMap();
        List<Integer> reverse = new ArrayList<>();
        int amount = topping.length;
        for(int i = 0; i < amount; i++){
            int key = topping[i];
            forward.put(key,forward.getOrDefault(key, 0)+1);
        }
        // System.out.println(forward);
        for(int i = amount-1; i >= 0; i--){
            int key = topping[i];
            if(reverse.contains(key) == false){
                reverse.add(key);
            }
            forward.put(key, forward.get(key)-1);
            if(forward.get(key) == 0){
                forward.remove(key);
            }
            // forward.entrySet().removeIf(entry -> entry.getValue() == 0);
            if(forward.size() == reverse.size()){
                // System.out.println(forward.size()+" : "+reverse.size());
                answer++;
            }
        }
        
        return answer;
    }
}