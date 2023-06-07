class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String aa =Integer.toString(a);
        String bb = Integer.toString(b);
        int ab = Integer.valueOf(aa+bb);
        int ba = Integer.valueOf(bb+aa);
        if(ab>=ba){
            answer = ab;
        } else{
            answer = ba;
        }
        return answer;
    }
}