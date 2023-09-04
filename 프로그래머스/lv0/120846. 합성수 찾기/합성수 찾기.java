import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList();
        // int j = 2;
        for(int i = 2; i <= n; i++){
            for(int j =i+1; j <=n; j++){
                if(j%i == 0 && !list.contains(j)){
                    list.add(j);
                    System.out.println(j);
                }
            // j++;
            }
        }
        
        return answer = list.size();
    }
}