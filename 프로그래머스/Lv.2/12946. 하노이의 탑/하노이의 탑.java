import java.util.*;

class Solution {
    ArrayList<int[]> list;
    public int[][] solution(int n) {
        list = new ArrayList();
        top(n,1, 2, 3);
        int[][] answer = new int[list.size()][2];
        
        for(int i = 0; i < answer.length; i++){
            int[] arr = list.get(i);
            answer[i][0] = arr[0];
            answer[i][1] = arr[1];
        }
        return answer;
    }
    
    public void top(int n, int s, int v, int e){
        int[] move = {s,e};
        
        if(n == 1){
            list.add(move);
        }else{
            top(n - 1, s, e, v);
            list.add(move);
            top(n - 1, v, s, e);
        }
    }
}