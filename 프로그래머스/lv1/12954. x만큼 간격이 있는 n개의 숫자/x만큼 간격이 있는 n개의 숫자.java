class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        int index = 0; 
        long i = x;
        while(index != n){
            answer[index] = i;
            index++;
            i += x;
        }
        return answer;
    }
}