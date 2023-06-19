class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        answer = new int[num_list.length+1];
        int len = answer.length;
        for(int i = 0;i<len;i++){
            if(i!=len-1)
                answer[i] = num_list[i];
            else{
                if(answer[i-2]<answer[i-1])
                    answer[i] = answer[i-1] - answer[i-2];
                else
                    answer[i] = answer[i-1]*2;        
            }
            // answer[i-2]<answer[i-1] ? answer[i] = answer[i-1] - answer[i-2] : 
            // answer[i] = answer[i-1]*2;
        }
        return answer;
    }
}