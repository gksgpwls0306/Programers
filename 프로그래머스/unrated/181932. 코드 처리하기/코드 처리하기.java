class Solution {
    public String solution(String code) {
        String answer = "";
        boolean mode = false;
        for(int i =0; i<code.length();i++){
            if(code.substring(i,i+1).equals("1")&&mode==false){
                mode = true;
            }else if(!(code.substring(i,i+1).equals("1"))&&mode==false){
                if(i%2==0)
                    answer += code.substring(i,i+1);
            }else if(code.substring(i,i+1).equals("1")&&mode==true){
                mode =false;
            }else if(!(code.substring(i,i+1).equals("1"))&&mode==true){
                if(i%2==1)
                    answer +=code.substring(i,i+1);
            }
            
        }
        if(answer.length()==0)
            answer="EMPTY";
        
        return answer;
    }
}