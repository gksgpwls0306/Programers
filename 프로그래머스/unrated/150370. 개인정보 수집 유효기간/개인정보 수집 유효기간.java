import java.text.*;
import java.util.*;
// import java.util.Calender;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};
        HashMap<String, Integer> map = new HashMap<>();
        // 약관
        for(String s : terms){
            String[] ss = s.split(" ");
            map.put(ss[0],Integer.valueOf(ss[1]));
            // System.out.println(map);
        }
        //개인정보
        // HashMap<String, String> pri = new HashMap<>();
        // for(String s : privacies){
        //     String[] ss = s.split(" ");
        //     pri.put(ss[0],ss[1]);
        // }
        
        // ArrayList<String>[][] list = new ArrayList[privacies.length][2];
        // for(int i = 0; i < privacies.length; i++){
        //     // list[i] = new ArrayList<String>(); 
        //     String[] ss = privacies[i].split(" ");
        //     list[i].add(ss[0]);
        //     list[i].add(ss[1]);
        //     System.out.println(privacies[i]);
        //     System.out.println(ss[0]);
        //     // list[i][0].add(privacies[i].split(" "));
        // }

        // for(String s : privacies){
        //     System.out.println(s);
        // }
        
        // for(String s : privacies){
        //     System.out.println(s);
        // }
        
        SimpleDateFormat sim = new SimpleDateFormat("yyyy.MM.dd");
        try{
            Date tday = sim.parse(today);
        }catch(Exception e){}
        Calendar cal = Calendar.getInstance();
        for(String s : privacies){
            try{
                // String day = s.split(" ")[0];
                Date date = sim.parse(s.split(" ")[0]);
                cal.setTime(date);
                int  m = map.get(s.split(" ")[1]);
                if(m >= 12){
                    cal.add(Calendar.YEAR, 1);
                    cal.add(Calendar.MONTH, m-12);
                    cal.add(Calendar.DATE, -1);
                    // System.o
                }else{
                    cal.add(Calendar.MONTH, m);
                }
                System.out.println(sim.format(cal.getTime()));
            }catch(Exception e){}
            
        }
        // cal.
        
        
        
        
        return answer;
    }
    
    //String to Cal
//     void toCal(String day) throws Exception{
        
//     }
}