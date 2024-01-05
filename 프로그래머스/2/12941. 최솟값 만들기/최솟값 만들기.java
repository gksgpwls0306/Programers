import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        int size = A.length;
        Arrays.sort(A);
        Arrays.sort(B);
        // for(int i : A){
        //     System.out.println(i);
        // }
        // for(int i : B){
        //     System.out.println(i);
        // }
        for(int i = 0; i < size; i++){
            answer += A[i] * B[size - 1 - i];
        }
        
        return answer;
    }
}