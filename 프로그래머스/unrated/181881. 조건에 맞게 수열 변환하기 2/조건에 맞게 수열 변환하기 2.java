import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] arr2 = new int[arr.length];
        while(true){
            for(int i = 0; i<arr2.length; i++)
                arr2[i] = arr[i];
            
            // System.out.println(arr2[i]);
            
            for(int i = 0; i<arr.length; i++){
                if(arr[i]>50 && arr[i]%2==0)
                    arr[i] /=2;
                else if(arr[i]<50 && arr[i]%2==1)
                    arr[i] = arr[i]*2+1;
            }
            if(Arrays.equals(arr,arr2))
                break;
            answer++;
        }
        return answer;
    }
}