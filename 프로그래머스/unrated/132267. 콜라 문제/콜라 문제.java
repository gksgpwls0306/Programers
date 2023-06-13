class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int left = 0;
        while(n>=a){
            left = n/a;
            answer +=left*b;
            // System.out.print(answer);
            n %= a;
            n += left*b;
            // System.out.print(n);            
        }
        return answer;
    }
}