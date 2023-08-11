class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        if(a%2==1 && b%2==1)
            return a*a+b*b;
        else if(a%2==0 && b%2==0)
            return a>b? a-b:b-a;
        else
        return 2*(a+b);
    }
}