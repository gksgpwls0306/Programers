class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int n1 = 2*a*b;
        String str = Integer.toString(a)+Integer.toString(b);
        int n2 = Integer.valueOf(str);
        if(n1>n2){
            answer = n1;
        } else {
            answer = n2;
        }
        return answer;
    }
}