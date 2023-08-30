import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        ArrayList<String> list = new ArrayList();
        for(int i = 0; i < my_string.length(); i++){
            if(!(my_string.substring(i,i+1).equals("a")||my_string.substring(i,i+1).equals("e")||my_string.substring(i,i+1).equals("i")||my_string.substring(i,i+1).equals("o")||my_string.substring(i,i+1).equals("u"))){
                list.add(my_string.substring(i,i+1));
            }
        }
        
        answer = String.join("",list);
        return answer;
    }
}