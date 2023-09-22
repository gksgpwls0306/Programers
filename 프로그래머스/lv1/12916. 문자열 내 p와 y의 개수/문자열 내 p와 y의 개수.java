import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pc = 0;
        int yc = 0;
        for(int i = 0; i < s.length(); i++){
            String c = (s.charAt(i)+"").toUpperCase();
            if(c.equals("P")){
                pc++;
}else if(c.equals("Y")){
                yc++;
            }
        }
        if(pc != yc){
            return false;
        }

        return answer;
    }
}