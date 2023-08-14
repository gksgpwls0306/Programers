class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int d = 0;
        for(int i = 1; i<common.length-1; i++){
            if(common[i]-common[i-1] == common[i+1]-common[i]){
                d = common[i]-common[i-1];
                return common[common.length-1]+d;
            }else {
                d = common[i]/common[i-1];
                return common[common.length-1]*d;
            }
        }
        return answer;
    }
}