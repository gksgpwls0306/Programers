class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        int cnt = 0;
        // for(int i = 0; i < arr.length; i++){
        //     for(int j = 0; j < arr[i].length(); j++){
        //         String ss = arr[i].charAt(j)+"";
        //         answer += j % 2 == 0 ? ss.toUpperCase() : ss.toLowerCase();
        //     }
        //     if(i != arr.length-1)
        //     answer += " ";
        // }
        for(String i : arr){
            cnt = i.equals(" ") ? 0 : cnt + 1;
            answer += cnt % 2 == 0 ? i.toLowerCase() : i.toUpperCase();
            
        }
        return answer;
    }
}