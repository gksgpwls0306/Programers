class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right - left + 1)];
        long srow = left / n;
        long scol = left % n;
        long erow = right / n;
        long ecol = right % n;
        int index = 0;
        if(srow == erow){
            for(long i = scol; i <= ecol; i++){
                if(srow >= i)
                    answer[index] = (int)srow + 1;
                else
                    answer[index] = (int)i + 1;
                index++;
            }
        }
        else{
            for(long i = srow; i <= erow; i++){
                for(long j = 0; j < n; j++){
                    if(index >= answer.length)
                        break;
                    if(i == srow && j < scol)
                        continue;
                    if(i >= j)
                        answer[index] = (int)i + 1;
                    else
                        answer[index] = (int)j + 1;
                    index++;
                }
            }
        }
        return answer;
    }
}