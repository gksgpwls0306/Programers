import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        HashMap<Integer, Integer> map = new HashMap();
        String[] arr = s.replace("{","").replace(","," ").replace("}","").split(" ");

        for(int i = 0; i < arr.length; i++){
            int num = Integer.valueOf(arr[i]);
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
        ArrayList<Integer> list = new ArrayList(map.keySet());
        Collections.sort(list,(a1,a2) -> (map.get(a2).compareTo(map.get(a1))));
        answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}