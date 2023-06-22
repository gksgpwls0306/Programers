class Solution {
    public int solution(String number) {
        int answer = 0;
        for(int i=0;i<number.length();i++){
            answer+=Integer.parseInt(number.substring(i,i+1));
        }
        return answer %=9;
    }
}