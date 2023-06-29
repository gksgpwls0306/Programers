import java.util.*;
class Solution {
    public ArrayList solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList();
        for(int i = 0; i<arr.length; i++){
            for(int j =0; j<arr[i]; j++)
                list.add(arr[i]);
        }
        return list;
    }
}