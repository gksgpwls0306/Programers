class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        a = a - 1;
        b = b - 1;
        answer++;
        
        while(a / 2 != b / 2){
            a /= 2;
            b /= 2;
            answer++;
        }
        return answer;
    }
}