import java.util.*;

class Solution {
    public ArrayList solution(String myStr) {
        String[] word = myStr.split("a|b|c");
        ArrayList list = new ArrayList(Arrays.asList(word)); //list형변환

        list.removeAll(Arrays.asList("", null));
  
        if(list.size()==0)
            list.add("EMPTY");
        // String[] answer = list.toArray(new String[list.size()]);
        return list;
    }
}