class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder answer = new StringBuilder();

        int startIndex = c - 1;
        while (startIndex < my_string.length()) {
            answer.append(my_string.charAt(startIndex));
            startIndex += m;
        }

        return answer.toString();
    }
}