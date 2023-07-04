class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        for(int i = 0; i<myString.length()-pat.length()+1; i++){
            if(myString.substring(i,pat.length()+i).equals(pat)){
                System.out.println(myString.substring(i,pat.length()+i));
                answer++;
            }

        }
        return answer;
    }
}