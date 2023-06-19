class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String old ="";
        String even ="";
        for(int n : num_list){
            if(n%2==0)
                even += Integer.toString(n);
            else
                old += Integer.toString(n);
        }
        // System.out.println(even);
        // System.out.println(old);
        
        return answer= Integer.parseInt(even)+Integer.parseInt(old);
    }
}