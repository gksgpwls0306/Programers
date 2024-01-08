class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] numbers = new int[100001];
        // numbers[0] = 0;
        numbers[1] = 1;
        numbers[2] = 1;
        for(int i = 3; i <= n; i++){
            numbers[i] = (numbers[i - 1] + numbers[i - 2]) % 1234567;
        }
        return numbers[n];
    }
}