class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        if(n%slice != 0)
            answer++;
        answer += n/slice;
        return answer;
    }
}