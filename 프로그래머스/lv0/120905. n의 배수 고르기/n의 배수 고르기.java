import java.util.*;

class Solution {
    public ArrayList solution(int n, int[] numlist) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList();
        for(int i = 0; i<numlist.length; i++){
            if(numlist[i]%n==0)
                list.add(numlist[i]);
        }
        return list;
    }
}