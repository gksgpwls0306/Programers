import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int qnum = answers.length;
        int[] st1 = {1, 2, 3, 4, 5};
        int[] st2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] st3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] num = {0, 0, 0};
        int max = 0;
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < answers.length; i++){
            if(answers[i] == st1[i % 5])
                num[0]++;
            if(answers[i] == st2[i % 8])
                num[1]++;
            if(answers[i] == st3[i % 10])
                num[2]++;
        }
        
        max = Math.max(Math.max(num[0],num[1]),num[2]);
        for(int i = 0; i < num.length; i++){
            if(max == num[i])
                list.add(i+1);
        }
        
        System.out.println(list);
        answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++)
            answer[i] = list.get(i);
        
        
        return answer;
    }
}