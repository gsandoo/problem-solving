package com.algorithm.ktb.쉬운최단거리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Main {

    static StringTokenizer st;
    static int [] dx = {1,0,-1,0};
    static int [] dy = {0,1,0,-1};

    static int [][] arr;
    static boolean [][] visited;
    static int N,M;

    public static void bfs (int x, int y){
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(x,y));
        visited[x][y] = true;
        arr[x][y] = 0;
        while (!q.isEmpty()){
            Point p = q.poll();
            for (int i = 0 ; i < 4; i++){
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];
                if (nx >= 0  && nx < N && ny >= 0 && ny < M && visited[nx][ny] == false && arr[nx][ny] != 0) {
                    q.offer(new Point(nx,ny));
                    visited[nx][ny] = true;
                    arr[nx][ny] = arr[p.x][p.y] + 1;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M  = Integer.parseInt(st.nextToken());

        arr = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0 ; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for (int j = 0 ; j < M ; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        boolean status = true;
        for (int i = 0 ; i < N ; i ++) {
            for(int j = 0 ;  j < M; j ++ ) {
                if (arr[i][j] == 2 && status == true) {
                    bfs(i,j);
                    status = false;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (arr[i][j] == 1 && !visited[i][j]) {
                    arr[i][j] = -1;
                }
            }
        }


        for (int i = 0 ; i < N ; i ++) {
            for(int j = 0 ;  j < M; j ++ ) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
