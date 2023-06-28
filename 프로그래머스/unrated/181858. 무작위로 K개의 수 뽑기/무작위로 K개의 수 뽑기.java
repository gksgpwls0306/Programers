import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = {};
        answer = new int[k];
        ArrayList<Integer> list = new ArrayList();
        for(int i=0;i<arr.length;i++){
            if(list.contains(arr[i]))
                continue;
            list.add(arr[i]);
        }
        if(k>list.size()){
            for(int i = list.size();i<k;i++)
                list.add(-1);
        }
        for(int i=0;i<k;i++)
            answer[i] = list.get(i);
        return answer;
    }
}