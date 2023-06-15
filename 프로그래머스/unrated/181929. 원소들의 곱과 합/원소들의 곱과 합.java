class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int hap =0;
        int gop =1;
        for(int i =0; i<num_list.length;i++){
            hap+=num_list[i];
            gop*=num_list[i];
        }
        return hap*hap>gop?1:0;
}
}