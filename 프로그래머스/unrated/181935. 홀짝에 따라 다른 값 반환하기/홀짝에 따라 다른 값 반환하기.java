class Solution {
    public int solution(int n) {
        int answer = 0;
        int a = 0;
        if(n%2 == 0){
            a = 2;
        }
        for(int i =1; i<=n;i++){
            if(n%2 == 0 && i%2 == 0){
                answer += i*i;
            }else if(n % 2 == 1 && i % 2 == 1){
                answer += i;
            }
            
        }
        return answer;
    }
}