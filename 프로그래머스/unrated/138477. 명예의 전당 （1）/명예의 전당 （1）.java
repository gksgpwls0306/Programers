import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        
        ArrayList<Integer> honor = new ArrayList<Integer>();            //매일 들어오는 점수를 저장할 arraylist
        
        int idx = Math.min(k, score.length);                            //k 와 score 의 길이중 적은 수를 사용
        
        for(int i=0; i<idx; i++) {                                      //명예의 전당에 꽉찰때까지 먼저 for문
            honor.add(score[i]);                                        //score의 i번째 점수를 추가
            Collections.sort(honor);                                    //가장 낮은 점수를 찾기 위해 오름차순 정렬
            answer[i] = honor.get(0);                                   //오른차순 정렬이기 때문에 가장 첫번째 점수만
        }                                                               //가져오면 됨
        
        for(int i=k; i<score.length; i++) {                             //명예의 전당은 다 채워졌고 이제 나머지 점수를 처리
            honor.add(score[i]);                                        //i번째 점수를 추가하고
            Collections.sort(honor, Collections.reverseOrder());        //내림차순으로 정렬
            answer[i] = honor.get(k-1);                                 //k번째 밖으로 밀려난 점수를 배열에 추가
        }
        return answer;
    }
}
