import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0; i < commands.length; i++ ){
            int s = commands[i][0]-1;
            int e = commands[i][1]-1;
            int num = commands[i][2]-1;
            int[] arr = new int[e-s+1];
            System.out.println(s);
            System.out.println(e);
            System.out.println(num);
            System.arraycopy(array,s,arr,0,(e-s+1));
            Arrays.sort(arr);
            answer[i] = arr[num];
        }
        return answer;
    }
}