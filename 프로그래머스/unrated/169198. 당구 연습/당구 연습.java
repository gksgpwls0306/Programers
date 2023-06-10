class Solution {
    public int[] solution(int m, int n, int startX, int startY, int[][] balls) {
        int[] answer = new int[balls.length];
        
        int[] arr = new int[4];
        
        for(int i = 0; i < balls.length; i++){
        
            // y 같은 경우
            if(startY == balls[i][1]){
                // 벽과 가까운 거리 구하기
                int minY = Math.min(n - startY, startY);

                // 가까운 벽과 왔다 갔다.
                arr[0] = (int) Math.pow(balls[i][0] - startX , 2) + (int) Math.pow(minY * 2, 2);
                // 시작점 x가 목표점 x값보다 작은 경우
                if(startX < balls[i][0]){
                    arr[1] = (int) Math.pow(startX + balls[i][0], 2);
                }
                // 시작점 x가 목표점 x값보다 큰 경우
                else {
                    arr[1] = (int) Math.pow(m - startX + m - balls[i][0], 2);
                }
                answer[i] = Math.min(arr[0], arr[1]);
            }
            // x 같은 경우
            else if(startX == balls[i][0]){
                // 벽과 가까운 거리 구하기
                int minX = Math.min(m - startX, startX);
                arr[0] = (int) Math.pow(minX * 2, 2) + (int) Math.pow(balls[i][1] - startY, 2);
                // 시작점 y가 목표점 y값보다 작은 경우
                if(startY < balls[i][1]){
                    arr[1] = (int) Math.pow(startY + balls[i][1], 2);
                }
                // 시작점 y가 목표점 y값보다 큰 경우
                else {
                    arr[1] = (int) Math.pow(n - startY + n - balls[i][1], 2);
                }
                answer[i] = Math.min(arr[0], arr[1]);
            }
            // 서로 다른경우
            else {
                
                // x가 m(벽)과 가까운 경우
                arr[0] = (int) Math.pow( m + (m - startX) - balls[i][0], 2) + (int) Math.pow(balls[i][1] - startY, 2);
                // x가 0과 가까운 경우
                arr[1] = (int) Math.pow(startX + balls[i][0], 2) + (int) Math.pow(balls[i][1] - startY, 2);
                // y가 n(벽)과 가까운 경우
                arr[2] = (int) Math.pow( n + (n - startY) - balls[i][1], 2) + (int) Math.pow(balls[i][0] - startX, 2);
                // y가 0과 가까운 경우
                arr[3] = (int) Math.pow(startY + balls[i][1] , 2)+ (int) Math.pow(balls[i][0] - startX, 2);
                      
                int min = arr[0];
                for(int j = 1; j < 4; j++){
                    if(min > arr[j]){
                        min = arr[j];
                    }
                }
                answer[i] = min;
            }
        }
        
        return answer;
    }
}