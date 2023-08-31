class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        int gab = array[0] >= n ? array[0]-n : n-array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] >= n){
                if(gab > array[i]-n ){
                    gab = array[i]-n;
                    answer = array[i];
                }else if(gab == array[i]-n){
                    answer = answer > array[i] ? array[i] : answer;
                }
            }else{
                if(gab > n-array[i] ){
                    gab = n-array[i];
                    answer = array[i];
                }else if(gab == n-array[i]){
                    answer = answer > array[i] ? array[i] : answer;
                }
            }
        }
        return answer;
    }
}