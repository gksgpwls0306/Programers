class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        for(int i = 0; i < before.length(); i++){
            char s = before.charAt(i);
            int in = after.indexOf(s);
            if(in == -1){
                System.out.println("index "+in+" s "+s);
                return 0;
            }
            after = after.substring(0,in)+after.substring(in+1);
        }
        return 1;
    }
}