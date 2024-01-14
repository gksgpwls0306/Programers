import java.util.*;

class Solution {
    public ArrayList<String> solution(String[] record) {
        HashMap<String, String> uid = new HashMap();
        ArrayList<String> answer = new ArrayList();
        String[] arr = new String[3];
        
        for(int i = 0; i < record.length; i++){
            if(record[i].split(" ").length == 3){
                uid.put(record[i].split(" ")[1],record[i].split(" ")[2]);
            }
        }
        
        for(int i = 0; i < record.length; i++){
            arr = record[i].split(" ");
            switch(arr[0]){
                case "Enter": answer.add(uid.get(arr[1])+"님이 들어왔습니다.");
                    break;
                case "Leave": answer.add(uid.get(arr[1])+"님이 나갔습니다.");
                    break;
                default: break;
            }
        }

        return answer;
    }
}