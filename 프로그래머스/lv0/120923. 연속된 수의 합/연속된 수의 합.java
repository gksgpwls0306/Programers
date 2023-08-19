// import java.util.*;

// class Solution {
//     public ArrayList solution(int num, int total) {
//         ArrayList<Integer> answer = new ArrayList();
//         int a = num/2;
//         int n = -a;
//         if(num%2==1){
//             for(int i = total/num; n<=a;n++){
//                 answer.add(i+n);
//             }  
//         }
//         return answer;
//     }
// }

class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int start = (total/num) - ((num - 1)/2);
        
        for(int i = 0; i < num; i++) {
            answer[i] = start;
            start++;
        }
        
        return answer;
    }
}