class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        for(int i : arr){
            answer += i;
        }
        answer /= arr.length;
        return answer;
    }
}