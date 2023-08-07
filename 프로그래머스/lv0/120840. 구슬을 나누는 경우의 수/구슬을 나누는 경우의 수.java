class Solution {
    public long solution(int c, int n) {
        if (c == n || n == 0)
            return 1;

        long answer = 1;
        int a = (c - n < n) ? c - n : n;

        for (int i = 0; i < a; i++) {
            answer *= (c - i);
            answer /= (i + 1);
        }

        return answer;
    }
}