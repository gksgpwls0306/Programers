class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int hx = 0;
        int xn = x;
        while(xn > 0){
            hx += xn%10;
            xn /= 10;
        }
        return answer = x % hx == 0 ? true : false; 
    }
}