import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        // int mid = array.length/2==1 ? array.length/2+1 : array.length/2;
        int mid = array.length/2;
        System.out.println(mid);
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        answer = array[mid];
        return answer;
    }
}