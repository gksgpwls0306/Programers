class Solution {
    public int solution(int[] number) {
        int answer = 0;
        int len = number.length;
        for(int i =0;i<len-2;i++){
            for(int j =i+1;j<len-1;j++){ // 중복 가능성 제거
                for(int k=j+1;k<len;k++){ // 중복 가능성 제거
                    if(number[i]+number[j]+number[k]==0){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}