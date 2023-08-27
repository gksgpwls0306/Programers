import java.util.*;

class Solution {
    public int solution(String my_string) {
        int result = 0;
        int temp = 0;

        for (char ch : my_string.toCharArray()) {
            if (Character.isDigit(ch)) {
                temp = temp * 10 + Character.getNumericValue(ch);
            } else {
                result += temp;
                temp = 0;
            }
        }
        result += temp;
        return result;
    }
}