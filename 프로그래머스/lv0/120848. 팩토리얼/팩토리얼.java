class Solution {
    public int solution(int n) {
        int answer = 1;
        int an = 1;
        for(int i = 2; an < n; i++){
            if(an*i > n)
                break;
            an *= i;
            answer++;
        }
        return answer;
    }
}