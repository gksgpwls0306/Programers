import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        int[] arr = new int[26];//a~z
        for(char c : s.toCharArray()){
            arr[c - 'a']++; //0 == a
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<26; i++){
            if(arr[i] == 1) sb.append((char)(i+'a'));
        }
        answer = sb.toString();
        
        return answer;
    }
}