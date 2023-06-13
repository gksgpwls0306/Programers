import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        Boolean[] num = new Boolean[n+1];
        num[0] = num[1] = false;
        for(int i=2;i<=n;i++)
            num[i] = true;
        
        for(int i =2; i<=Math.sqrt(n);i++){ // 제곱근써서 절반만 배수확인
            if(!num[i])
                continue;
            for(int j =2;i*j<=n;j++){
                num[i*j] = false;
            }
        }
        for(int i=0;i<=n;i++){
            if(num[i])
                answer++;
        }
        return answer;
    }
}