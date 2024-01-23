class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        for(int i = 0; i < citations.length; i++){
            int h = citations[i];
            int cnt = 0;
            int j = 0;
            if(h != 0){
                while(j < citations.length){
                    if(citations[j] >= h){
                        cnt++;
                    }
                    // System.out.println(h+" "+cnt+" "+citations[j]);
                    j++;
                }
            h = Math.min(cnt, h);
            }
            // System.out.println(answer+" "+h+" !");
            if(answer < h){
                answer = h;
                // System.out.println(answer+" "+h);
            }
        }
        return answer;
    }
}