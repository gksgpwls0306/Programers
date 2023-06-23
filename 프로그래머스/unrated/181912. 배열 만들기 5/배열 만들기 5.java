import java.util.*;
class Solution {
    public ArrayList solution(String[] intStrs, int k, int s, int l) {

        ArrayList<Integer> answer = new ArrayList();
        int j=0;
        for(int i=0;i<intStrs.length;i++ ){
            int num = Integer.parseInt(intStrs[i].substring(s,s+l));
            System.out.print(num);
            if(k<num)
                answer.add(num);
        }


        return answer;
    }
}