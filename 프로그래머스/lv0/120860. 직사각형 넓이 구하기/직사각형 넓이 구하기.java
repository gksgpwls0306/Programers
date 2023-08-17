import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int w=0, h=0;
        for(int i = 1; i<dots.length; i++){
            if(dots[0][0]==dots[i][0])
                w= Math.max(dots[0][1],dots[i][1])-Math.min(dots[0][1],dots[i][1]);
            if(dots[0][1]==dots[i][1])
                h = Math.max(dots[0][0],dots[i][0])-Math.min(dots[0][0],dots[i][0]);
        }
        return w*h;
    }
}