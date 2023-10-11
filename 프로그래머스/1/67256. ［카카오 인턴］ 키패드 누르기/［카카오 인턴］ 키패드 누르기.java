class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int l = 10;
        int r = 12;
        for(int i : numbers){
            
            if(i == 1 || i == 4 || i == 7){ ///L 
                answer += "L";
                l = i;
            }else if(i == 3 || i == 6 || i == 9){ ///R
                answer += "R";
                r = i;
            }else {
                if(i == 0)
                    i = 11;
                int lh = Math.abs(l - i) / 3 + Math.abs(l - i) % 3;
                int rh = Math.abs(r - i) / 3 + Math.abs(r - i) % 3;
                if(lh > rh){
                    answer += "R";
                    r = i;
                }
                else if(lh < rh){
                    answer += "L";
                    l = i;
                }
                else{
                    if(hand.equals("left")){
                        answer += "L";
                        l = i;
                    }else{
                        answer += "R";
                        r = i;
                    }
                }
            }
        }
        return answer;
    }
}