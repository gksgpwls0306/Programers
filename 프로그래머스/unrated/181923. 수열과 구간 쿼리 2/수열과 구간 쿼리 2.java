import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        answer = new int[queries.length];
        Arrays.fill(answer, Integer.MAX_VALUE);
        for(int i=0; i<queries.length;i++){
            int max = queries[i][1];
            int min = queries[i][0];
            int num = queries[i][2];
            System.out.println(max);
            System.out.println(min);
            for(int j=min;j<=max;j++){
                if(arr[j]>num){
                    if(answer[i] > arr[j]) // 가장 작은 arr[i] 조건
                        answer[i] = arr[j];
                }
                
            }
            if(answer[i]== Integer.MAX_VALUE)
                answer[i] = -1;
        }
        return answer;
    }
}