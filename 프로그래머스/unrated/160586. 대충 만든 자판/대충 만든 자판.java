import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<Character, Integer> list = new HashMap<>();

        for(String s: keymap){
            for(int i = 0; i<s.length(); i++){
                char c = s.charAt(i);
                if(!list.containsKey(c) || i<list.get(c)){
                    list.put(c,i+1);
                    System.out.println(list.get(c));
                }
            }
        } //값 설정
        
        for(int i=0 ; i<targets.length ; i++) {
            int cnt = 0;
            for(int j=0 ; j<targets[i].length() ; j++) {
                char c = targets[i].charAt(j);
                if(!list.containsKey(c)) {
                    cnt = 0;
                    break;
                } else {
                    cnt += list.get(c);
                }
            }
            answer[i] = cnt==0?-1:cnt;
        } // 입력값과 확인
        
        return answer;
    }
}