class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt=1;
        boolean check=false;
        String numstr ="";
        while(true){     
            check=false;

            if(answer%3==0){
                answer++;
                continue;
            }    
            numstr=String.valueOf(answer);
            //else{
                if(numstr.contains("3")){
                    answer++;
                    check=true;
                    //break;
                }
            //}

            if(check) continue;

            if(cnt==n)break;
            answer++;
            cnt++;

            System.out.println("answer:"+answer);

        }
        return answer;
    }
}