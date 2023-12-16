import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        HashMap<String, Integer> map = new HashMap();
        for(int i = 0; i < number.length; i++){
            map.put(want[i], number[i]);
        }
        int end = 0;
        int sum = 0;
        for(int i = 0; i < discount.length - 9; i++){
            
            while(end < i+10) {
                if(map.containsKey(discount[end])){
                    map.replace(discount[end], map.get(discount[end])-1);

                    // System.out.println(map+" "+end);
                }
                end++;
            }
            for(String key : map.keySet()){    
                if(map.get(key) >= 0){
                    sum += map.get(key);
                }
                // System.out.println("key: "+ key +" sum: " +sum);
            }
            if(sum == 0){
                answer++;
            }
            if(map.containsKey(discount[i])){
                map.replace(discount[i], map.get(discount[i])+1);
                // System.out.println(map.get(discount[i]));
            }
            sum = 0;
            
        }
        return answer;
    }
}