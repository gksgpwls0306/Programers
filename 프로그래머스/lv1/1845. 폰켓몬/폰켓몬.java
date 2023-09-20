import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int max = nums.length / 2;
        HashSet<Integer> list = new HashSet<>();
        for(int i : nums){
            list.add(i);
        }
        
        return answer = list.size() < max ? list.size() : max;
    }
}