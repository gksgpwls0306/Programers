class Solution {
    public int solution(int num, int k) {
        String strNum = num+"";
        String strK = k+"";
        
        int answer = strNum.indexOf(strK);
        
        return answer>-1 ? ++answer : answer;
    }
}