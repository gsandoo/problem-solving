package com.algorithm.programmers.일반문제.리코쳇로봇;


import java.util.LinkedList;
import java.util.Queue;

class Point {
     int x;
     int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class Solution {
    static  int col,row;
    int[]dx = {-1,1,0,0};
    int[]dy = {0,0,-1,1};


    public int solution(String[] board) {
        col = board.length;
        row = board[0].length();
        int[][]visit = new int[col][row];

        Queue<Point> queue = new LinkedList<>();

        // 시작점 찾기
        for (int i = 0; i < col; i++){
            String line = board[i];
            for (int j = 0 ; j < line.length(); j++){
                if (line.charAt(j)=='R'){
                    visit[i][j] = 1;
                    queue.add(new Point(i,j));
                    break;
                }
            }
        }

        //
        int answer = -1;
        while (!queue.isEmpty()){
            Point point = queue.poll();
            if (board[point.x].charAt(point.y) == 'G'){
                answer = visit[point.x][point.y] - 1;
                break;
            }

            for (int i = 0 ; i < 4 ; i++){
                int nx = point.x + dx[i];
                int ny = point.y + dy[i];

                while (true){
                    if (isNextAvailable(nx,ny) && board[nx].charAt(ny) != 'D'){
                        nx += dx[i];
                        ny += dy[i];
                    }else {
                        nx -= dx[i];
                        ny -= dy[i];
                        break;
                    }
                }
                if (visit[nx][ny] == 0){
                    queue.add(new Point(nx,ny));
                    visit[nx][ny] = visit[point.x][point.y] +1;
                }
            }
        }


        return answer;
    }

    public boolean isNextAvailable(int x, int y){
         if (0 <= x && x < col && 0 <= y && y < row) {
            return true;
        }return false;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String[]board = {"...D..R",".D.G...","....D.D","D....D.","..D...."};

        System.out.println(s.solution(board));
    }

}
