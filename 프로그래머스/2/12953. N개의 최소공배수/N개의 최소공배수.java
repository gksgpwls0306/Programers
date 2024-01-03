import java.lang.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        for(int i = 0; i < arr.length-1; i++){
            int start = answer == 0 ? arr[0] : answer;
            int big = Math.max(start,arr[i+1]); 
            int small = Math.min(start,arr[i+1]); 
            answer = big * small / gcd(big, small);
        }
        
        
        return answer;
    }
    public int gcd(int a, int b){
        int n = a % b;
        if(n == 0){
            return b;
        }
        return gcd(b,n);
        
    }
}