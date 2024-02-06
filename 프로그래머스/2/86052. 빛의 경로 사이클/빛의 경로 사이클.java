import java.util.*;

class Solution {
    static boolean[][][] visited;
    static int row, col;
    static int[] dx = {-1, 0, 1, 0}; //아래-왼-위-오른
    static int[] dy = {0, -1, 0, 1};

    public int[] solution(String[] grid) {
        List<Integer> answer = new ArrayList<>();
        row = grid.length;
        col = grid[0].length();
        visited = new boolean[row][col][4];

        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                for(int d=0;d<4;d++) {
                    if(!visited[i][j][d]) {
                        answer.add(light(grid, i, j, d));
                    }
                }
            }
        }

        return answer.stream().sorted().mapToInt(i->i).toArray();
    }

    public int light(String[] grid, int i, int j, int d) {
        int count = 0;

        while(!visited[i][j][d]) {
            count++;
            visited[i][j][d] = true;

            if(grid[i].charAt(j) == 'L') {
                d = (d+3) % 4; //좌회전
            }
            if(grid[i].charAt(j) == 'R') {
                d = (d+1) % 4; //우회전
            }
            
            i = (i+dx[d]+row) % row;
            j = (j+dy[d]+col) % col;
        }
        return count;
    }
}