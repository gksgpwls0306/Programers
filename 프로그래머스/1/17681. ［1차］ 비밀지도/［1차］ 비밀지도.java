class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String form = "";
        for(int i = 0; i < n; i++){
            form +="0";
        }
        
        for(int i = 0; i < n; i++){
            String n1 = Integer.toBinaryString(arr1[i]);
            n1 = form.substring(0, n - n1.length()) + n1;
            String n2 = Integer.toBinaryString(arr2[i]);
            n2 = form.substring(0, n - n2.length()) + n2;
            answer [i] = "";
            for(int j = 0; j < n; j++){
                if(n1.charAt(j) == '0' && n2.charAt(j) == '0'){
                    answer[i] += " ";
                    
                }else{
                    answer[i] += "#";
                }
                System.out.println(answer[i]);
            }
        } 
        return answer;
    }
}