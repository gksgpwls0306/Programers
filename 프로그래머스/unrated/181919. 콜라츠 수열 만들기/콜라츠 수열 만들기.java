import java.util.*;
class Solution {
    public ArrayList solution(int n) {
        int[] answer = {};
        ArrayList num = new ArrayList();
        int count = 0;
        num.add(n);
        while(n!=1){
            if(n%2==0)
                n/=2;
            else
                n = 3*n+1;
            count++;
            num.add(n);
        }
        // answer = new int[num.size];
        // for(int i=0; i<num.size; i++){
        //     answer[i] = num.get(i);
        // }
        return num;
    }
}