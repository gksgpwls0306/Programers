class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        String[] slist = s.split("");
        answer[0] = -1;
        for(int i = 1; i < slist.length; i++){
            int near = 0;
            for(int j = 0; j < i; j++){
                if(slist[i].equals(slist[j]))
                    near = i - j;
            }
            answer[i] = near == 0 ? -1 : near;
        }
        return answer;
    }
}