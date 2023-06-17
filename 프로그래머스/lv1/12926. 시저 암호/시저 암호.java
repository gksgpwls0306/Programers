class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] alpha = new char[s.length()]; //A =65, Z=90, a=97,z=122
        for(int i =0; i<alpha.length;i++){
            char num = s.charAt(i);
            // System.out.println(numto);
            // int num = Integer.valueOf(s.charAt(i));
            if(num==' '){
                answer += num;
                continue;
            }
            else{
                if(num>=65&&num<=90){
                    if(num+n>90)
                        num-=26;
                }else if(num>=97&&num<=122){
                    if(num+n>122)
                        num-=26;
                }
                answer +=(char)(num+n);
            }
        }
        // for(int i=0; i<alpha.length;i++){
        //     answer += alpha[i];
        // }
        return answer;
    }
}