import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        int[] answer = {};
        TreeMap<Integer, Integer> costs = new TreeMap(); //요금
        HashMap<Integer, Integer> table = new HashMap(); //시각
        
        for(int i = 0; i < records.length; i++){
            int time = (Integer.parseInt(records[i].substring(0,2)) * 60) + 
                Integer.parseInt(records[i].substring(3,5));
            int car = Integer.parseInt(records[i].substring(6,10));
            String type = records[i].split(" ")[2];
            switch(type){
                case "IN":
                    table.put(car, time);
                    break;
                case "OUT": 
                    costs.put(car, costs.getOrDefault(car,0) + time - table.get(car));
                    table.remove(car);
                    break;
                default: System.out.println(type);
            }
        }
        
        if(!table.isEmpty()){
            int lastTime = 23 * 60 + 59;
            for(Integer num : table.keySet()){
                int time = table.get(num);
                costs.put(num, costs.getOrDefault(num, 0) + lastTime - time);
                // table.remove(num);
            }
        }
        
        System.out.println(costs.values());
        answer = new int[costs.size()];
        int i = 0;
        for(Integer car : costs.keySet()){
            if(costs.get(car) > fees[0]){
                int leaveTime = (costs.get(car) - fees[0]) / fees[2];
                if((costs.get(car) - fees[0]) % fees[2] != 0){
                    leaveTime++;
                }
                answer[i] = fees[1] + leaveTime * fees[3];
                
            }else{
                answer[i] = fees[1];
            }
            i++;
        }
        
        return answer;
    }
}