class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        for(int num = 0; num<queries.length; num++){
            int i = queries[num][0];
            int j = queries[num][1];
            int temp = 0;
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }
}