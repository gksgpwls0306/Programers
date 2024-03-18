import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> qu = new PriorityQueue();
        for(int i : scoville){
            qu.add(i);
        }
        // System.out.println(qu+" "+qu.size());
        
        while(qu.peek() < K){
            int n1 = qu.poll(), n2 = qu.poll();
            n2 = n1 + (n2 * 2);
            qu.add(n2);
            answer++;
            // System.out.println(qu +" "+answer);
            if(qu.size() == 1 && qu.peek() < K)
                return -1;
        }
        return answer;
    }
}