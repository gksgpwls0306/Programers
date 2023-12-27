import java.util.*;

class Solution {
    public int solution(int n) {
        // int answer = 0;
        int[] count = new int[60001]; 
        count[1] = 1;
        count[2] = 2;
        for(int i = 3; i <= n; i++){
            count[i] = (count[i - 1] + count[i - 2]) % 1000000007; 
        }

        return count[n];
    }
}