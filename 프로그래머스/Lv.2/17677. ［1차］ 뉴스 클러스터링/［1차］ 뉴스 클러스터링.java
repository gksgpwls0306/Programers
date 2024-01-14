import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 1;
        int max = 0;
        int min = 0;
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        System.out.println(str1);
        ArrayList<String> s1 = new ArrayList();
        ArrayList<String> s2 = new ArrayList();
        String condition = "^[a-zA-Z]{2}$";
        
        // for(int i = 0; i < str1.length() - 1;i++){
        //     s1 = 
        // }
        for(int i = 0; i < str2.length() - 1; i++){
            String ss = str2.substring(i, i + 2);
            if(ss.matches(condition))
                s2.add(ss);
        }
        for(int i = 0; i< str1.length() - 1; i++){
            String ss = str1.substring(i, i + 2);
            if(ss.matches(condition))
                s1.add(ss);
        }
        // s1 - s2
        for(int i = 0; i < s1.size(); i++){
            String alpha = s1.get(i);
            if(s2.contains(alpha)){
                s2.remove(s2.indexOf(alpha));
                min++;
            }
        }
        max = s1.size() + s2.size();
        if(max == 0&& min == 0)
            return 65536;
        answer = min * 65536 / max;
        
        // System.out.println(str1);
        return answer;
    }
}