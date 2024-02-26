import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int index = 1110;
        int[] a1 = {};
        int[] a2 = {};
        
        for(int i = 0; i < priorities.length; i++){
            int max = 0;
            for(int j = i; j < priorities.length; j++){
                int cur = max;
                max = Math.max(max, priorities[j]);
                if(max == priorities[j]){
                    if(cur == max)
                        index = Math.min(index, j);     
                    else
                        index = j;
                }
            }
            // System.out.println(location+" "+index+" "+max+" "+answer+"!");
            if(index == i && index == location){
                return ++location;
            }
            a1 = Arrays.copyOfRange(priorities, i, index); // 뒤로 갈 부분
            a2 = Arrays.copyOfRange(priorities, index, priorities.length); // 앞으로 갈 부분

            System.arraycopy(a2, 0, priorities, i, a2.length);
            System.arraycopy(a1, 0, priorities, i + a2.length, a1.length);
            if(index > location)
                location = priorities.length - index + location;
            else
                location = location - index + i;
            
            // for(int p : a2){
            //     System.out.print(p+" ");
            // }
            // System.out.print(" + ");
            // for(int p : a1){
            //     System.out.print(p+" ");
            // }
            // System.out.println("");
            // for(int p : priorities){
            //     System.out.print(p+" ");
            // }
            // System.out.println(" i:"+i);
            // System.out.println(location+" "+index+" "+max+" :"+answer);
            if(i == location){
                return ++location; // 횟수는 +1
            }
        }
        return answer;
    }
}