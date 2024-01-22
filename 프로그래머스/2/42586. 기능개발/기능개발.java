import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList();
        ArrayList<Integer> time = new ArrayList();
        for(int i = 0; i < progresses.length; i++){
            int work = progresses[i];
            int day = speeds[i];
            while(work < 100){
                work += day;
                if(time.size() == i )
                    time.add(1);
                else
                    time.set(i, time.get(i)+1);
            }
        }
        
        int max = time.get(0);
        int day = 0;
        answer.add(1);
        for(int i = 1; i < time.size(); i++){
            if(max < time.get(i)){
                day++;
                answer.add(1);
                max =time.get(i);
            }else{
                answer.set(day, answer.get(day)+1);
            }
        }
        
        
        
        return answer;
    }
}