class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = cal(picture,k);
        return answer;
    }
    private static String[] cal(String[] picture,int k){
        int size = picture.length;
        String[] result = new String[k * size];
        for(int i = 0 ; i < k * size ; i++){
            if(i % k != 0){
                result[i] = result[i-1];
                continue;
            }
            StringBuilder sb = new StringBuilder();
            for(int j = 0 ; j < k * picture[i/k].length() ; j++){
                sb.append(picture[i/k].charAt(j / k));
            }
            result[i] = sb.toString();
        }
        return result;
    }
}