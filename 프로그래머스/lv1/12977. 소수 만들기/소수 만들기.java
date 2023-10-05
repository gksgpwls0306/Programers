class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int sum =0;

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){
                	//배열 중 3개 더하기
                    sum = nums[i]+nums[j]+nums[k];
                    
                    //소수 찾기(소수이면 +1)
                    if(isPrime(sum)){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
        
    private boolean isPrime(int num){
		//i=1부터가 아닌 이유는 1은 나눌 필요 없는 수이므로
       	//나누어 떨어지면 소수가 아니므로 false
        for(int i=2; i<num; i++){
            if(num%i==0)
                return false;
        }
		//나누어 떨어지지 않으면 true
        return true;
    }  
}

// class Solution {
//     public int solution(int[] nums) {
//         int answer = 0;
//         ArrayList<Integer> list = new ArrayList<>();
//         for(int i = 0; i < nums.length - 2; i++){
//             for(int j = i+1; j < nums.length - 1; j++){
//                 for(int k = i+2; k < nums.length; k++ ){
//                     if(!list.contains(nums[i]+nums[j]+nums[k])){
//                         list.add(nums[i]+nums[j]+nums[k]);
//                     }
//                 }
//             }
//         }
//         for(int i = 0; i < list.size(); i++){
//             answer++;
//             for(int j = 2; j < list.get(i); j++){
//                 if(list.get(i) % j == 0){
//                     answer--;
//                     break;   
//                 }
//             }
//         }
//         return answer;
//     }
// }