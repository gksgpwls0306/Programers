class Solution {
    public int solution(int n) {
        int answer = 1;
        int num = 1;
        while((n*num)%6 != 0){
            num++;
            if((n*num)%6 == 0)
                break;
        }
        answer = n*num/6;
        return answer;
    }
}