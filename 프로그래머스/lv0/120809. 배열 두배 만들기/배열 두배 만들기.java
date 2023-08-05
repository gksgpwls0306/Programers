class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        for(int i = 0; i<numbers.length; i++){
            numbers[i] *=2;
        }
        return numbers;
    }
}