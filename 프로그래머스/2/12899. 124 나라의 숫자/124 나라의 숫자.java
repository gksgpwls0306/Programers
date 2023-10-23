class Solution {
    public String solution(int n) {
        String answer = "";
        String[] list = {"4","1","2"};
        int num = n;
        while (num > 0){
            int i = num % 3;
            answer = list[i] + answer;
            num /= 3; 
            if(i == 0)
                num--;
        }
        return answer;
    }
}