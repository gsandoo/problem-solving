package com.algorithm.boj.solvedac.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


class Point_그림{
    int x;
    int y;
    Point_그림(int  x, int y ) {
        this.x = x;
        this.y = y;
    }
}

public class 그림 {

    static int n , m , count , biggest = Integer.MIN_VALUE, size;
    static int [] dx = {-1,0,1,0};
    static int [] dy = {0,1,0,-1};
    static  int [][] arr;
    static boolean[][] visited;
    static Queue<Point_그림> q;
    static StringTokenizer st;
    public static void bfs(int x, int y){
        q.offer(new Point_그림(x,y));
        visited[y][x] = true;
        arr[y][x] = 0;
        size = 1;

        while (!q.isEmpty()){
            Point_그림 tmp = q.poll();
            for (int i = 0 ; i < 4 ; i++){
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if (nx >= 0 && nx < m  && ny >= 0 && ny < n && arr[ny][nx] == 1 && visited[ny][nx] == false){
                    size ++;
                    q.offer(new Point_그림(nx, ny));
                    arr[ny][nx] = 0;
                    visited[ny][nx] = true;
                }
            }
        }
        count ++;
        biggest = Math.max(biggest, size);
        size = 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        visited = new boolean[n][m];
        q = new LinkedList<>();
        count = 0;
        biggest = 0;

        for (int y = 0 ; y < n; y++) {
            st = new StringTokenizer(br.readLine());
            for (int x = 0; x < m; x++) {
                arr[y][x] = Integer.parseInt(st.nextToken());
            }
        }

        // 모든 arr 가 0이 될때 까지
        for (int i = 0 ; i < n ; i++){
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 1) {
                    bfs(j,i);
                }
            }
        }

        System.out.println(count);
        System.out.println(biggest);
    }
}
