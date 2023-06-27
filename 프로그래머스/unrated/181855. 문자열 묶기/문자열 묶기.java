import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] count = new int[100000];
        for(int i = 0; i<strArr.length;i++)
            count[strArr[i].length()]++;    // 문자열 길이의 인덱스에 값을 증가시킴

        return Arrays.stream(count).max().getAsInt(); //max함수 위해 stream 생성 후, int형으로 전환
    }
}