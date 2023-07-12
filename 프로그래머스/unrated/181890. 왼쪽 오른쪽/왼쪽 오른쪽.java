import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        ArrayList<String> list = new ArrayList();
        int s = 0;
        int e = 0;
        for(int i = 0; i<str_list.length; i++){
            if(str_list[i].equals("l")){
                e = i;
                break;
            }else if(str_list[i].equals("r")){
                s = i+1;
                e = str_list.length;
                break;     
            }
        }
        for(int i =s; i<e; i++)
            list.add(str_list[i]);
        answer = list.toArray(new String[list.size()]);
        return answer;
    }
}