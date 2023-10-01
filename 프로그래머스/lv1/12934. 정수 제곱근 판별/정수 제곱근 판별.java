class Solution {
    public long solution(long n) {
        long answer = -1;
        long num = 1;
        while(num * num <=n){
            if(num * num == n){
                answer = num ;
                break;
            }
            num++;
        }
        if(answer >0){
            answer = (answer+1)*(answer+1);
        }
        return answer;
    }
}