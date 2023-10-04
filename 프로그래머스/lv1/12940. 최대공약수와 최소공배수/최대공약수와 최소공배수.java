class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {0,0};
        // int[] 
        int max = Math.max(n,m);
        int min = Math.min(n,m);
        for(int i = 1; i <= min; i++){
            if(n % i == 0 && m % i == 0)
                answer[0] = i;
        }
        for(int i = max; i <= n*m; i++){
            if(i % n == 0 && i % m == 0){
                answer[1] = i;
                break;
            }
        }
        return answer;
    }
}