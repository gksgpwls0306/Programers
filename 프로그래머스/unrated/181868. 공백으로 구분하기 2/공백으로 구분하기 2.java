import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        String[] answer = my_string.replaceAll("\\s+"," ").split(" ");
        ArrayList<String> list = new ArrayList(Arrays.asList(answer));
        list.removeAll(Arrays.asList(null,""));
        System.out.println(list);
        answer = list.toArray(new String[list.size()-1]);
        return answer;
    }
}