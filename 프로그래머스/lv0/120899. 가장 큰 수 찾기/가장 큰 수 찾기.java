class Solution {
    public int[] solution(int[] array) {
        int[] answer = {0,0};
        int n = 0;
        int index = 0;
        for(int i = 0; i<array.length; i++){
            if(array[i]>n){
                n = array[i];
                index= i;
            }
        }
        answer[0] = n;
        answer [1] = index;
        return answer;
    }
}