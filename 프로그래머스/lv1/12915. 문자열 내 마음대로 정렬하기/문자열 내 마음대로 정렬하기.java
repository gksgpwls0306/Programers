import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        ArrayList<String> list = new ArrayList<>();
        for(String i : strings){
            list.add(i.charAt(n)+i);
            System.out.println(list);
        }
        Collections.sort(list);
        
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i).substring(1);
        }
        
        return answer;
    }
}