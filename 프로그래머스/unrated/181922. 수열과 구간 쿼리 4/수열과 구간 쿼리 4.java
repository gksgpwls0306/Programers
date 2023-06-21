class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        // answer = new int[queries.length];
        for(int i=0; i<queries.length;i++){
            int max = queries[i][1];
            int min = queries[i][0];
            int num = queries[i][2];
            System.out.println(max);
            System.out.println(min);
            for(int j=min;j<=max;j++){
                if(j%num==0)
                    arr[j]+=1;
            }
        }
        return arr;
    }
}