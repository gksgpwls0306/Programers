import java.util.*;

class Solution {
    public ArrayList solution(int n, long k) {
        ArrayList<Integer> answer = new ArrayList();
        long max = 1;
        long target = k-1;
        ArrayList<Integer> list = new ArrayList();
        
        for(int i = 1; i <= n; i++){
            max *= i;
            list.add(i);
        }
        
        // while(n> )
        for(int i = n; i > 1; i--){
            max /= i;
            int x = Long.valueOf(target / max).intValue();
            answer.add(list.get(x));
            list.remove(x);
            target %= max;
        }
        // int x = (int)(target % 2);
        // answer.add(list.get(x));
        // list.remove(x);
        answer.add(list.get(0));
        // list.remove(0);
        // System.out.println(max+" "+list+" "+list.get(0));
        return answer;
    }
}