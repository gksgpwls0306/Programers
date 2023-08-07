class Solution {
    public int solution(int hp) {
        int answer = 0;
        while(hp>0){
            if(hp>=5){
                answer = hp/ 5;
                hp -= answer*5;
            } else if(hp>=3){
                hp -=3;
                answer++;
            } else{
                hp--;
                answer++;
            }
        }
        return answer;
    }
}