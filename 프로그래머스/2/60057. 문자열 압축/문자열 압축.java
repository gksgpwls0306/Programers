class Solution {
    public int solution(String s) {
        int answer = s.length();
        int count = 1;
        for(int i = 1; i <= s.length() / 2; i++){
            String result = new String();
            String base = s.substring(0, i);
            for(int j = i; j <= s.length(); j += i){
                int endIdx = Math.min(j + i, s.length());   
                String compare = s.substring(j, endIdx);
                if(base.equals(compare)){
                    count++;
                } else {
                    if(count >= 2){
                        result += count;
                    }
                    result += base;
                    base = compare;
                    count = 1;
                }
            }
            result += base;
            answer = Math.min(answer, result.length());
        }
        return answer;
    }
}