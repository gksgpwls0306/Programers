class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {0,0};
        int max = brown + yellow;
        for(int i = 1; i <= max; i++){
            int num = 0;
            if(max % i == 0){
                num = max / i;
                if(num + i == (brown+4) / 2){
                    answer[0] = Math.max(i, num);
                    answer[1] = Math.min(i, num);
                    break;
                }
            }
        }
        
        return answer;
    }
}