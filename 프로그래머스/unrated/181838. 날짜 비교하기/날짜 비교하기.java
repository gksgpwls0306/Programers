class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        int count = 0;
        for(int i = 0; i<3; i++){
            if(date1[i]<date2[i]&&count==0){
                return 1;
            }
            if(date1[i]>date2[i]){
                count++;
            }
        }
        return 0;
    }
}