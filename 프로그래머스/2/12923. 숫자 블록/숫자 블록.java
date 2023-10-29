import java.util.*;

class Solution {
    public static int[] solution(long begin, long end) {
        int[] answer = new int[(int)(end - begin) + 1];

        for (int i = (int)begin,idx = 0; i <= end; i++) {
            answer[idx++] = getMaxDivisorExceptMe(i);
        }

        return answer;
    }


    private static int getMaxDivisorExceptMe(int x) {
        if (x == 1) {
            return 0;
        }

        List<Integer> l = new ArrayList<>();

        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                l.add(i);
                if (x / i <= 10_000_000) {
                    return x/i;
                }
            }

        }
        if (!l.isEmpty()) {
            return l.get(l.size() - 1);
        }

        return 1;
    }

}