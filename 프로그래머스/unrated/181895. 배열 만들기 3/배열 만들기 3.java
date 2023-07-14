import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = {};
        int[] a1 = Arrays.copyOfRange(arr,intervals[0][0],intervals[0][1]+1);
        int[] a2 = Arrays.copyOfRange(arr,intervals[1][0],intervals[1][1]+1);
        answer = new int[a1.length+a2.length];
        System.arraycopy(a1,0,answer,0,a1.length);
        System.arraycopy(a2,0,answer,a1.length,a2.length);
        System.out.println(a1);
        System.out.println(a2);
//         for(int i = 0; i<2; i++){
//             int s = intervals[i][0];
            
//             int e = intervals[i][1];
//             System.out.println("S"+s+", E"+e);
//             if(i==0){
//                 a1 = Arrays.copyOfRange(arr,s,e+1);
//                 System.out.println(a1);
//             }else{
//                 a2 = Arrays.copyOfRange(arr,s,e+1);
//                 System.out.println(a2);
//             }
            
            
//         }
        return answer;
    }
}