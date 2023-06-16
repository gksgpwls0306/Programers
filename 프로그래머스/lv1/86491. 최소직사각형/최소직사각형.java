class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int width = 0;
        int height = 0;
        for(int i=0;i<sizes.length;i++){
            if(sizes[i][0]>sizes[i][1]){
                if(width<sizes[i][0])
                    width=sizes[i][0];
                if(height<sizes[i][1])
                    height=sizes[i][1];
            }else{
                if(width<sizes[i][1])
                    width=sizes[i][1];
                if(height<sizes[i][0])
                    height=sizes[i][0];
            }
        }
        
        return answer=width*height;
    }
}