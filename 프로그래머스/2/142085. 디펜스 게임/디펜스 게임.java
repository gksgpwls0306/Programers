import java.util.*;

class Solution {
    public int solution(int n, int k, int[] enemy) {
        int answer = k; 
        int[] pass = new int[1000001];
        int length = enemy.length;
        int min = 1000001, index = 0;
        
        // 무적권이 많음
        if(k >= length){
            return length;
        }
        
        // 무적권사용
        for(int i = 0; i < k; i++){
            pass[enemy[i]]++;
            min = Math.min(min,enemy[i]);
            // System.out.println(enemy[i]+" "+pass[enemy[i]]+" "+min);
        }
        
        for(int i = k; i < length; i++){
            int kill = enemy[i];
            
            if(kill > min){
                n -= min;
                pass[kill]++;
                pass[min]--;
                
                for(int j = 0; j < pass.length; j++){
                    if(pass[j] > 0){
                        min = j;
                        break;
                    }
                }
                // System.out.println(answer+" "+kill+" "+n+" "+min+" change");
            }
            else{
                n -= kill;
                // System.out.println(answer+" "+kill+" "+n+" "+min);
            }
            
            if(n >= 0)
                answer++;
            else
                return answer;
        }
        return answer;
    }
}