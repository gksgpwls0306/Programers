class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int max = 0;
        for(int i = 0; i<myString.length()-pat.length()+1;i ++){
            if(myString.substring(i,pat.length()+i).equals(pat)){
                if(max<i+(pat.length()-1)){
                    max = i+(pat.length()-1);
                }
            }
        }
        answer = myString.substring(0,max+1);
        return answer;
    }
}