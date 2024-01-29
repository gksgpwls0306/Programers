import java.util.*;

class Solution {
    public int solution(int[] arrayA, int[] arrayB) {
        int answer = 0;
        int aMod = 0;
        int bMod = 0;
        Arrays.sort(arrayA);
        Arrays.sort(arrayB);
        int a = arrayA[0];
        int b = arrayB[0];
        
        for(int i = 1; i < arrayA.length; i++){
            int aB = arrayA[i];
            int bA = arrayB[i];
            aMod = a % aB;
            bMod = b % bA;
            
            while(aMod > 1){
                a = aB;
                aB = aMod;
                aMod = a % aB;
            }
            while(bMod > 1){
                b = bA;
                bA = bMod;
                bMod = b % bA;
            }
            
            if(aMod == 0)
                a = aB;
            else
                a = 1;
            
            if(bMod == 0)
                 b = bA;
            else
                 b = 1;
        }
        for(int aa : arrayA){
            if(aa % b == 0){
                b = 0;
                break;
            }
        }
        for(int bb : arrayB){
            if(bb % a == 0){
                a = 0;
                break;
            }
        }
        answer = Math.max(a,b);
        return answer;
    }
}

// class Solution {
//     public int solution(int[] arrayA, int[] arrayB) {
//         int answer = 0;
//         int i = 2;
//         Arrays.sort(arrayA);
//         Arrays.sort(arrayB);
        
//         while(i <= arrayA[0]){
//             int cnt = 0;
//             for(int j = 0; j < arrayA.length; j++){
//                 if(arrayA[j] % i == 0 && arrayB[j] % i != 0)
//                     cnt++;
//                 else if(arrayA[j] % i != 0 && arrayB[j] % i == 0)
//                     cnt--;
//                 else
//                     break;
//             }
//             if(Math.abs(cnt) == arrayA.length && answer < i){
//                 answer = i;
//             }
//             i++;
//         }
//         return answer;
//     }
// }