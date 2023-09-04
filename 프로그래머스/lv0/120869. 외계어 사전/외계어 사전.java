class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        for(int i = 0; i < dic.length; i++){
            int n = 0;
            for(int j = 0; j<spell.length; j++){
                if(dic[i].contains(spell[j])){
                    n++;
                }
            }
            if(n == spell.length){
                return 1;
            }
        }
        return answer;
    }
}