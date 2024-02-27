class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        String full = "";
        int num = 0, cnt = 0;
        
        while(full.length() <= t*(m+1)){
            full += Integer.toString(num,n).toUpperCase();
            num++;
        }
        for(int i = 0; i < t; i++){
            answer += full.charAt(i * m + p - 1)+"";
        }
        answer = answer.toUpperCase();
        System.out.println(full);
        return answer;
    }
}