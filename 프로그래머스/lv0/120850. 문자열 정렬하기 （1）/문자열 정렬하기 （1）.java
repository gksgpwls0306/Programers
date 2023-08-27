import java.util.*;


class Solution {
    public ArrayList solution(String my_string) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList();
        for(int i = 0; i<my_string.length(); i++){
            char c = my_string.charAt(i);
            if(c >= 48 && c <= 57){
                
                list.add(Character.getNumericValue(c));
            }
        }
        list.sort(Comparator.naturalOrder());
        return list;
    }
}