import java.util.*;

class Solution {
    int[] arr;
    int answer;
    public int solution(int n) {
        answer = 0;
        arr = new int[n];
        back(n, 0);
        return answer;
    }
    public void back(int n, int x){
        if(n == x){
            answer++;
            return;
        }
        for(int i = 0; i < n; i++){
            arr[x] = i;
            if(condition(x)){
                back(n, x+1);
            }
        }
        
    }
    public boolean condition(int line){
        for(int i = 0; i < line; i++){
            if(arr[i] == arr[line] || 
               Math.abs(i-line) == Math.abs(arr[i] - arr[line]))
                return false;
            
        }
        return true;
    }
}