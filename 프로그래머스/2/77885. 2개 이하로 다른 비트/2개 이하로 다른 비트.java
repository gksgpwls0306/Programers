class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            long num = numbers[i];
            if(num % 2 == 0)
                answer[i] = ++num;
            else{
                String binary = Long.toBinaryString(num);
                // System.out.println(Long.bitCount(num)+" "+(long)(Math.log10(Long.parseLong(binary))+1));
                if(binary.contains("0")){
                    int index = binary.lastIndexOf("0");
                    binary = binary.substring(0,index) + "10" + binary.substring(index+2);                    
                }
                else{
                    binary = "10" + binary.substring(1);
                }
                answer[i] = Long.parseLong(binary,2);
            }
        }
        return answer;
    }
}