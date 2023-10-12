class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i = left; i <= right; i++){
            int n = 1;
            int cnt = 0;
            while(n <= i){
                if(i % n == 0)
                    cnt++;
                n++;
            }
            if(cnt % 2 == 0)
                answer += i;
            else
                answer -= i;
        }
        return answer;
    }
}