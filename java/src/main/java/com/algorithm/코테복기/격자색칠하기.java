package com.algorithm.코테복기;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class 격자색칠하기 {
    static int[][] arr;
    static boolean[][]visited;
    static int[] dx;
    static int[] dy;
    static int R,C,D,A;
    static Queue<Point> q;

    static void bfs(int n, int[] command) {
        R = command[0];
        C = command[1];
        D = command[2];
        A = command[3];

        q = new LinkedList<>();
        q.offer(new Point(R-1,C-1));
        visited[R-1][C-1] = true;
        arr[R-1][C-1] = n;


        dx = new int[2];
        switch (D){
            case 0:
                dx = new int[]{-1, 0};
                dy = new int[]{0, 1};
                break;
            case 1:
                dx = new int[]{0, 1};
                dy = new int[]{1, 0};
                break;
            case 2:
                dx = new int[]{1, 0};
                dy = new int[]{0, -1};
                break;
            case 3:
                dx = new int[]{0, -1};
                dy = new int[]{-1, 0};
                break;
        }
        while (!q.isEmpty()){
            Point p = q.poll();
            for (int i = 0; i < 2; i++){
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];
                if (nx >= 0 && nx < arr.length && ny >=0 && ny < arr[0].length && !visited[nx][ny] && A < 0) {
                    arr[nx][ny] = n;
                    q.offer(new Point(nx,ny));
                    visited[nx][ny] = true;
                    A--;
                }
            }
        }

    }

    public int[][]solution(String[][]grid, int[][] commands){
        int[][] answer = {};

        visited = new boolean[grid.length][grid[0].length];
        arr = new int[grid.length][grid[0].length];

        // 미리 방문 처리
        for (int i = 0 ; i < grid.length; i ++) {
            for (int j = 0 ; j < grid[i].length; j++){
                if (grid[i][0].charAt(j) == '#') visited[i][j] = true;
            }
        }

        // bfs
        for (int i = 0 ; i < commands.length; i++){
            bfs(i+1, commands[i]);
        }
        answer = arr;
        return  answer;
    }


    public static void main(String[] args) {
        격자색칠하기 ps = new 격자색칠하기();

        String[][] grid = {
                {"...#.."},
                {"..#..."},
                {"......"},
                {".###.."},
                {"......"},
        };
        int[][] commands = {
                {2, 0, 0, 3},  // (2,0)에서 12시/3시 방향 최대 3칸
                {1, 2, 1, 2},  // (1,2)는 벽(#)이므로 시작 불가
                {4, 0, 2, 4},  // (4,0)에서 6시/9시 방향 최대 4칸
                {0, 5, 3, 2}   // (0,5)에서 9시/12시 방향 최대 2칸
        };

        System.out.println(ps.solution(grid,commands));
    }
}
