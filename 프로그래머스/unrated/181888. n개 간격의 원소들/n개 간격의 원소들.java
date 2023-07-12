import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList();
        for(int i = 0; i<num_list.length; i++){
            if(i% n ==0)
                list.add(num_list[i]);
        }
        answer = list.stream().mapToInt(i ->i).toArray(); 
        return answer;
    }
}