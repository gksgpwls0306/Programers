import java.util.*;
class Solution {
    public ArrayList solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(answer));
        for(int i = 0; i<finished.length; i++){
            if(finished[i] == false)
                list.add(todo_list[i]);
        }
        // answer = arrayList.toArray(new String[list.size()]);
        return list;
    }
}