class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        int len = control.length();
        for(int i=0;i<len;i++){
            char num = control.charAt(i);
            switch(num){
                case 'w': n+=1; break;
                case 's': n-=1; break;
                case 'd': n+=10; break;
                case 'a': n-=10; break;
                default: break;
            }
        }
        
        return n;
    }
}