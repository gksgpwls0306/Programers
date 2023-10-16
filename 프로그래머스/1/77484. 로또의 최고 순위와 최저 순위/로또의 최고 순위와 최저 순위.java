import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zero = 0;
        int bingo = 0;
        for(int i = 0; i < lottos.length; i++){
            if(lottos[i] == 0)
                zero++;
            for(int j : win_nums){
                if(j == lottos[i])
                    bingo++;
            }
        }
        System.out.println(zero+" "+bingo);
        answer[0] = 7 - (zero + bingo);
        answer[1] = 7 - bingo;
        for(int i = 0; i < answer.length; i++){
            if(answer[i] == 7)
                answer[i] = 6;
        }
        return answer;
    }
}