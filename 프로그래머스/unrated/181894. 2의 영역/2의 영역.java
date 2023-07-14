import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList(); 
        int s = 100000;
        int e = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==2){
                s = Math.min(s,i);
                System.out.println(s);
                e = Math.max(e,i);
            }
        }
        if(e != 0){
            answer = Arrays.copyOfRange(arr,s,e+1);
            // answer = list.stream().mapToInt(i->i).toArray();
        }
        else if(s == 100000){
            return new int[]{-1};
        }
        else{
            return new int[]{arr[s]};
        }
        return answer;
    }
}