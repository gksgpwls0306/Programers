class Solution {
    public String solution(int[] food) {
        String answer = "";
        for(int i = 1; i < food.length; i++){
            int max = food[i] / 2;
            if(max != 0){
                for(int j = 0; j < max; j++){
                    answer += i+"";
                }
            }                    
        }
        StringBuffer re = new StringBuffer(answer).reverse();
        answer += "0" + (re.toString());
        return answer;
    }
}