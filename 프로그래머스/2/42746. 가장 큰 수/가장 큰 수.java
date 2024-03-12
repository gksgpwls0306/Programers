import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] arr = new String[numbers.length];
        
        for(int i = 0; i < numbers.length; i++){
            arr[i] = Integer.toString(numbers[i]);
        }
        
        Arrays.sort(arr, (a1, a2) -> (a2+a1).compareTo(a1+a2));
        
        if(arr[0].equals("0"))
            return "0";
        
        for(String ss : arr){
            answer += ss;
        }
        return answer;
    }
}