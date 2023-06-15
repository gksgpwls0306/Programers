class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        boolean[] width = new boolean[n+m] ;
        for(int i =0; i<n+m;i++) {
            width[i]=false;
            for(int j =0; j<section.length;j++){
                if(section[j]==(i+1)){
                    width[i]=true;
                    break;
                } 
            }
            // System.out.println(width[i]);
        }
        for(int i =0; i<n;i++) {
            if(width[i]){
                for(int j =i; j<i+m;j++)
                    // for(int k =j;k<i+m;k++)
                    width[j]=false;
                answer++;
                
            }
        }
        
        
        return answer;
    }
}