import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
        for(int i = 0; i<numbers.length; i++){
            
            if(list.contains(numbers[i])){
                list.remove(list.indexOf(numbers[i]));
                    System.out.println(list);
            }
        }
        if(list.size()>0){
            for(int i = 0; i<list.size(); i++ ){
                answer +=list.get(i);
                System.out.println(answer);
            }
        }else{
            return -1;
        }
        return answer;
    }
}