class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int index = 0;
        int[] basket = new int[board.length * board.length];
        for(int i = 0; i < moves.length; i++){
            for(int j = 0; j < board.length; j++){
                int doll = board[j][moves[i]-1];
                if(doll != 0){
                    basket[index] = doll;
                    board[j][moves[i]-1] = 0;
                    // System.out.println(j+" "+i);
                    // System.out.println(doll);
                    if(index != 0 && basket[index] == basket[index-1]){
                        answer += 2;
                        basket[index] = 0;
                        basket[index-1] = 0;
                        index -= 2;
                    }
                    index++;
                    break;
                }
            }
        }
        return answer;
    }
}