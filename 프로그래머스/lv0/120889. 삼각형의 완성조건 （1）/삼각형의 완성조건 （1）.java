class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int index = 0;
        int n = 0;
        int sum = 0;
        for(int i = 0; i<sides.length; i++){
            if(n<sides[i]){
                index = i;
                n = sides[i];
            }
        }
        for(int i = 0; i<sides.length; i++){
            if(i != index){
                sum +=sides[i];
            }
        }
        
        return sum>n ? 1 : 2;
    }
}