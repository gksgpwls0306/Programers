import java.util.*;

class Solution {
    public ArrayList solution(int[] arr, int[] delete_list) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList();
        for(int i = 0; i<arr.length; i++){
            list.add(arr[i]);
        }
        System.out.print(list);
        for(int  i = 0; i<delete_list.length; i++){
            if(list.indexOf(delete_list[i]) != -1){
                list.remove(list.indexOf(delete_list[i]));
            }
        }
        return list;
    }
}