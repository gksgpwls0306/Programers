import java.util.*;
class Solution {
    public ArrayList solution(int[] arr, boolean[] flag) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList();
        for(int i = 0; i<arr.length;i++){
            if(flag[i]==true){
                for(int j = 0; j < 2*arr[i]; j++)
                    list.add(arr[i]);
            }else{
                for(int j = 0; j < arr[i]; j++)
                    list.remove(list.size()-1);
            }
        }
        return list;
    }
}