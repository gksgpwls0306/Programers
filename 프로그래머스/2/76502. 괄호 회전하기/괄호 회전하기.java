import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        ArrayList<String> list = new ArrayList();
        Stack<String> st = new Stack();
        String move = "";
        int j = s.length(), max = 0;
        for(int i = 0; i < j; i++){
            list.add(s.substring(i, i+1));
        }
        
        for(int i = 0; i < j; i++){
            move = list.get(0);
            String last = list.get(j-1);
            
            if(move.equals(")") || move.equals("]") || move.equals("}") ||
              last.equals("(") || last.equals("[") || last.equals("{")){
            }else{
                for(int ii = 0; ii < j; ii++){
                    String target = list.get(ii);
                    
                    if(!st.isEmpty() && (target.equals(")") || target.equals("]") || target.equals("}"))){
                        int num = 0;
                        switch(target){
                            case ")":
                                num = st.search("(");
                                break;
                            case "]":
                                num = st.search("[");
                                break;
                            case "}":
                                num = st.search("{");
                                break;
                        }
                        
                        if(num == -1){
                            break;
                        }else{
                            while(num > 0){
                                st.pop();
                                num--;
                            }
                            continue;
                        }
                    }
                    st.push(target);
                }
                if(st.isEmpty()){
                    answer++;
                }
                st.clear();
            }
            list.remove(0);
            list.add(move);
        }
        return answer;
    }
}