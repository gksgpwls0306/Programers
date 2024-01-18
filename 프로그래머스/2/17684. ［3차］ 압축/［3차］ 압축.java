import java.util.*;

class Solution {
    public ArrayList<Integer> solution(String msg) {
        HashMap<String, Integer> dic = new HashMap();
        char c = 65;
        int index = 1;
        for(; index <= 26; index++){
            dic.put(c+"",index);
            c++;
        }
        ArrayList<Integer> ans = new ArrayList();
        
        for(int i = 0; i < msg.length(); i++){
            for(int j = i + 1; j <= msg.length(); j++){

                if(dic.get(msg.substring(i, j)) != null){
                    // System.out.println("포함"+" "+msg.substring(i,j));
                    if(j == msg.length()){
                        ans.add(dic.get(msg.substring(i,j)));
                        return ans;
                    }
                }
                if(dic.get(msg.substring(i,j)) == null){
                    ans.add(dic.get(msg.substring(i, j - 1)));
                    dic.put(msg.substring(i, j), index);
                    index++;
                    // System.out.print(msg.substring(i, j)+" ");
                    i = j - 2;
                    break;
                }
            }
        }
        
        return ans;
    }
}