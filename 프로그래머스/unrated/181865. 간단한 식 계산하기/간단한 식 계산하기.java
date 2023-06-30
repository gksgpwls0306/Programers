class Solution {
    public int solution(String binomial) {
        int answer = 0;
        // String[] op = {"+","-","*"};
        int n1 = 0, n2 = 0, op = 0;
        // for(int i = 0; i<binomial.length(); i++){
        //     int opn = binomial.indexOf(op[i]);
        //     n1 = Integer.parseInt(binomial.substring(0,i));
        //     n2 = Integer.parseInt(binomial.substring(i+1));
        //     if(binomial.contains("+"))
        //         answer = n1 + n2;
        //     if(binomial.contains("-"))
        //         answer = n1 - n2;
        //     if(binomial.contains("*"))
        //         answer = n1 * n2;
        // }
        if(binomial.contains("*")){
        op = binomial.indexOf("*");
        n1 = Integer.parseInt(binomial.substring(0,op-1));
        n2 = Integer.parseInt(binomial.substring(op+2));
        // System.out.print(n2);
        answer = n1*n2;
        } else if(binomial.contains("+")){
        op = binomial.indexOf("+");
        n1 = Integer.parseInt(binomial.substring(0,op-1));
        n2 = Integer.parseInt(binomial.substring(op+2));
            answer = n1+n2;
        } else if(binomial.contains("-")){
        op = binomial.indexOf("-");
        n1 = Integer.valueOf(binomial.substring(0,op-1));
        n2 = Integer.valueOf(binomial.substring(op+2));
        answer = n1-n2;
        }
        return answer;
    }
}