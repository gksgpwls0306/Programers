class Solution {
    public String solution(String myString) {
        String answer = "";
        for(int i =0; i<myString.length(); i++){
            int num = (int)myString.charAt(i);
            if(num<108){
               myString = myString.substring(0,i)+'l'+myString.substring(i+1);
                }
        }
        return myString;
    }
}