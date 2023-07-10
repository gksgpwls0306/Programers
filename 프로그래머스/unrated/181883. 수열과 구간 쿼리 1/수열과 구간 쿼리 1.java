class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        for(int i = 0; i<queries.length; i++){
            int sind = queries[i][0];
            int eind = queries[i][1];
            for(int j = sind; j<=eind; j++)
                arr[j]++;
         }
        return arr;
    }
}