import java.util.*;

class Solution {
    public int solution(String[][] book_time) {
        int answer = 0;
        Arrays.sort(book_time, (x1,x2) -> timeConvert(x1[0]) - timeConvert(x2[0]));
        
        // for(String[] s : book_time){
        //     System.out.println(s[0]+" "+s[1]);
        // }
        
        for(int i = 0; i < book_time.length; i++){
            String[] end = book_time[i];
            int endTime = timeConvert(end[1]) + 10;
            if(endTime == 1450)
                continue;
            answer++;
            int j = i+1;
            
            while(j < book_time.length){
                String[] start = book_time[j];
                int startTime = timeConvert(start[0]);
                if(startTime != 1440 && startTime >= endTime){
                    // System.out.println(book_time[j][0]+" "+book_time[j][1] +" "+startTime+" "+endTime);
                    endTime = timeConvert(start[1]) + 10;
                    book_time[j][0] = "24:00";
                    book_time[j][1] = "24:00";
                    // System.out.println(book_time[j][0]+" "+book_time[j][1]);
                }
                j++;
            }
        }
        return answer;
    }
    
    public int timeConvert(String time){
        return Integer.parseInt(time.split(":")[0]) * 60 + Integer.parseInt(time.split(":")[1]);
    }
}