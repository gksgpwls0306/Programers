class Solution {
    public int solution(int n) {
        int answer = 0;
        int end = 1;
        int sum = 0;
        for(int i = 1; i <= n; i++){
            while(sum <= n){
                if(sum == n){
                    answer++;
                    break;
                }
                sum += end;
                end++;
            }
            sum -=i;
        }
        return answer;
    }
}