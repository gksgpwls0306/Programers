import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};
        int month = 28;
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        // 약관
        for(String s : terms){
            String[] ss = s.split(" ");
            map.put(ss[0],Integer.valueOf(ss[1])*month);
        }
        // today
        int tday = Integer.valueOf(today.split("\\.")[0])*month*12+Integer.valueOf(today.split("\\.")[1])*month+Integer.valueOf(today.split("\\.")[2]);
        
        //변환 및 비교
        for(int i = 0; i < privacies.length; i++){
            String s = privacies[i].split(" ")[0];
            String a = privacies[i].split(" ")[1];
            int dday = Integer.valueOf(s.split("\\.")[0])*month*12+Integer.valueOf(s.split("\\.")[1])*month+Integer.valueOf(s.split("\\.")[2]);
            System.out.println(map.get(a));
            dday += map.get(a);
            
            if(tday >= dday){
                list.add(i+1);
            }
        }
        answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
      
        return answer;
    }
}