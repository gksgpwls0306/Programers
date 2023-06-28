class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        if(arr1.length>arr2.length)
            answer = 1;
        else if(arr1.length<arr2.length)
            answer = -1;
        else if(arr1.length==arr2.length){
            int a1 = 0,a2 = 0;
            for(int i = 0;i<arr1.length;i++){
                a1 += arr1[i];
                a2 += arr2[i];
            }
            answer = a1>a2? 1:(a1<a2?-1:0);
        }
        return answer;
    }
}