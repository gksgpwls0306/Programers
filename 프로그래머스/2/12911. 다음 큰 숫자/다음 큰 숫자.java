class Solution {
   public int solution(int n) {
        int answer = n;
        while(answer<=1000000){
            answer++;
            if(Integer.bitCount(n) == Integer.bitCount(answer))
                return answer;
            
        }
        return answer;
    }
}