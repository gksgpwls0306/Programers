//마법의 엘리베이터

//절댓값이 10 ^ c ( c >= 0 인 정수)
//더한 값으로 이동
//0보다 작으면 엘리베이터는 움직이지 않습니다.
//0층이 가장 아래층 -> 엘리베이터 와 민수 모두 0층

//절반보다 크면 더해서 큰 값을 만드는게 이득
//절반보다 작으면 빼서 작은 값을 만드는게 이득

class Solution {
    public int solution(int storey) {
        int answer = 0;

        String stVal = String.valueOf(storey);
        char[] chars = stVal.toCharArray();
        int[] ints = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            ints[i] = chars[i] - '0';
        }

        for (int i = ints.length - 1; i >= 0; i--) {
            int anInt = ints[i];

            if (anInt == 10) {
                if (i - 1 < 0) {
                    answer += 1;
                    continue;
                }

                ints[i - 1]++;
                continue;
            }

            if (anInt >= 6) {
                answer += (10 - anInt);
                if (i - 1 < 0) {
                    answer += 1;
                    continue;
                }
                ints[i - 1]++;
            } else if (anInt <= 4) {
                answer += anInt;
            } else if (anInt == 5) {
                if (i - 1 < 0) {
                    answer += 5;
                    continue;
                } else {
                    if (ints[i - 1] < 5) {
                        answer += anInt;
                    } else {
                        answer += 5;
                        ints[i - 1]++;
                    }
                }
            }
        }

        return answer;
    }
}