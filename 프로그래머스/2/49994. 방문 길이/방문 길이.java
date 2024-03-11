import java.util.*;

class Solution {
    public int solution(String dirs) {
        int answer = 0;
        int nx = 0, ny = 0, px = 0, py = 0;
        HashSet<String> set = new HashSet();
        
        for(int i = 0; i < dirs.length(); i++){
            char c = dirs.charAt(i);
            switch(c){
                case 'U': ny++; break;
                case 'D': ny--; break;
                case 'L': nx--; break;
                case 'R': nx++; break;
            }
            
            if(nx < -5 || nx > 5 || ny < -5 || ny > 5){
                nx = px;
                ny = py;
                continue;
            }
            int[][] arr = {{px, py}, {nx, ny}};
            Arrays.sort(arr, 
                        (arr1, arr2) -> arr1[0] < arr2[0] ? arr1[0] - arr2[0] : 
                        arr1[1] - arr2[1]);
            
            set.add(arr[0][0]+" "+arr[0][1]+" "+arr[1][0]+" "+arr[1][1]);
            px = nx;
            py = ny;   
        }
        
        return set.size();
    }
}