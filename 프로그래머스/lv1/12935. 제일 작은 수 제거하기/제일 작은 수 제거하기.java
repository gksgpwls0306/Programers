class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1 == 0 ? 1 : arr.length - 1];
        int min = arr[0];
        int index = 0;
        if(arr.length == 1){
            answer[0] = -1;
            return answer;
        }
            
        for(int i = 1; i < arr.length; i++){
            min = min < arr[i] ? min : arr[i];
        }
        for(int i = 0; i < arr.length; i++){
            if(min == arr[i]){
                continue;
            }
            answer[index] = arr[i];
            index++;
        }
        
        return answer;
        
    }
}