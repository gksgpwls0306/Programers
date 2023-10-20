class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] alpha = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String ss = s;
        for(int i = 0; i < alpha.length; i++){
            ss = ss.replace(alpha[i],Integer.toString(i));
        }
        answer = Integer.valueOf(ss);
        return answer;
    }
}