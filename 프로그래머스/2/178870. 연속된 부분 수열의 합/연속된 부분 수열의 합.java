class Solution {
    public int[] solution(int[] sequence, int k) {
        int first = 0;
        int last = sequence.length;
        int length = 0;
        int j = 0;
        int sum = 0;
        for(int i = 0; i < sequence.length; i++ ){
            while(sum < k && j < sequence.length){
                sum += sequence[j];
                j++;    
            }
            if(sum == k){
                length = j-i-1;
                if(last-first>length){
                    first = i;
                    last = j-1;
                }                
            }
            sum -= sequence[i];
        }
        int[] answer = {first, last};
        return answer;
    }
}