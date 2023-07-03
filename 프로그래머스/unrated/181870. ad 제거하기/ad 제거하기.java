import java.util.*;
class Solution {
    public ArrayList solution(String[] strArr) {
        String[] answer = {};
        ArrayList<String> list = new ArrayList(Arrays.asList(strArr));
        ArrayList<String> result = new ArrayList();
        for(int i = 0; i<list.size(); i++){
            if(list.get(i).contains("ad")){
                continue;
                // list.remove(i); // remove는 중간에 다 처리하지 못하는 경우가 생길 수 있음
            }else{
                result.add(list.get(i));
            }
        }
            
        return result;
    }
}