class Solution {
    public int solution(int n) {
        int answer = 0;
        String to3 = "";
        // String to10 = "";
        while(n>0){
            to3 = Integer.toString(n % 3) + to3;
            n /= 3;
        }
        
        StringBuffer reverse = new StringBuffer(to3).reverse();
        
        for(int i = reverse.length()-1; i >= 0; i--){
            answer += Integer.valueOf(reverse.charAt(i)+"") * Math.pow(3,(reverse.length()-1)-i);
        }
        return answer;
    }
}