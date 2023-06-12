class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int pl = p.length();
        int tl = t.length();
        long pnum = Long.valueOf(p);
        String val;
        for(int i =0 ; i<=(tl-pl);i++){
            val = t.substring(i,i+pl);
            if(Long.valueOf(val)<=pnum)
                answer++;
        }
        return answer;
    }
}