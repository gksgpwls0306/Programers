import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int ll = arr.length;
        while(ll%2 == 0) {
            ll = ll/2;
        }
        if(ll == 1) {
            return arr;
        }
        double x = 0;
        int y = 0;
        int len = arr.length;
        while(len > x) {
            x = Math.pow(2, y++);
        }
        int[] answer = new int[(int)x];
        for(int i = 0; i< arr.length; i++) {
            answer[i] = arr[i];
        }
        return answer;
    }
}


// import java.util.*;

// class Solution {
//     public ArrayList solution(int[] arr) {
//         int[] answer = {};
//         int len = 0;
//         ArrayList<Integer> list = new ArrayList();
//         for(int i = 0;i<arr.length;i++){
//             list.add(arr[i]);
//         }
//         System.out.println(list);
//         for(int i=2; i<=512;i*=2){
//             if(list.size()<=i){
//                 len = i;
//                 break;
//             }
//         }
//         for(int i =list.size();i<len;i++)
//             list.add(0);
//         System.out.print(list);
//         return list;
//     }
// }