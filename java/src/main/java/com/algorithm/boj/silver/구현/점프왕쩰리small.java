package com.algorithm.boj.silver.구현;

import java.util.*;
import java.io.*;

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class 점프왕쩰리small {

    static int N;
    static boolean[][]visited;
    static int[][] arr;
    static StringTokenizer st;
    static Queue<Point> q;


    static String bfs(int x, int y){
        q = new LinkedList<>();
        visited[x][y] = true;
        q.add(new Point(x,y));
        while (!q.isEmpty()){
            Point p = q.poll();

            int [] dx = {arr[p.x][p.y], 0};
            int [] dy = {0, arr[p.x][p.y]};

            for (int i = 0 ; i < 2; i ++) {
                int nx = p.x + dx[i]; // 1
                int ny = p.y + dy[i]; // 0

                if (nx == N-1 && ny == N-1) return "HaruHaru";
                if (nx >= 0 && nx < N && ny >= 0 && ny < N && visited[nx][ny] == false){
                    q.add(new Point(nx,ny));
                    visited[nx][ny] = true;
                }
            }
        }
        return "Hing";
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        arr = new int[N][N];
        visited = new boolean[N][N];

        for (int i = 0 ; i < N; i++ ) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0 ; j < N; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(bfs(0,0));
    }
}
