import java.util.*;

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        int x = board[0]/2;
        int y = board[1]/2;
        for(int i = 0; i<keyinput.length; i++){
            switch(keyinput[i]){
                case "left" : 
                    if(answer[0]>-x){
                        answer[0]--;
                    }
                    break;
                case "right" :
                    if(answer[0]<x)
                        answer[0]++;
                    break;
                case "up" :
                    if(answer[1]<y)
                        answer[1]++;
                    break;
                case "down": 
                    if(answer[1]>-y)
                        answer[1]--;
                    break;
            }
        }
        return answer;
    }
}