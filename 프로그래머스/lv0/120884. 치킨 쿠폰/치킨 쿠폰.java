class Solution {
    final int BONUS_NUM = 10;

    public int solution(int coupon) {
        int answer = 0;

        int orderChick = coupon / BONUS_NUM;
        int restCoupon = orderChick + coupon % BONUS_NUM;

        while (true) {
            answer += orderChick;

            if (restCoupon < BONUS_NUM) {
                break;
            }

            orderChick = restCoupon / BONUS_NUM;
            restCoupon = orderChick + restCoupon % BONUS_NUM;
        }

        return answer;
    }
}
