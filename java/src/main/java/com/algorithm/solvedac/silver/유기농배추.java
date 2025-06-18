package com.algorithm.solvedac.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Point{
    int x;
    int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class 유기농배추 {

    static int [] dx = {-1,0,1,0};
    static int [] dy = {0,1,0,-1};
    static int T, M, N, K, count ;
    static int [][] arr;
    static boolean[][] visited;
    static Queue<Point> q;
    static StringTokenizer st;

    public static void bfs(int y, int x) {
        q.offer(new Point(x,y));
        visited[y][x] = true;
        while (!q.isEmpty()){
            Point tmp = q.poll();
            for (int i = 0; i < 4 ; i ++){
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if (nx >= 0 && nx < M && ny >= 0 && ny < N && arr[ny][nx] == 1 && !visited[ny][nx]){
                    q.offer(new Point(nx, ny));
                    visited[ny][nx] = true; // 방문 처리
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());

        for (int i = 0 ; i < T ; i++) {
            st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            // arr, distance 배열 만들기
            arr = new int[N][M];
            visited = new boolean[N][M];
            q = new LinkedList<>();
            count = 0;

            // 배추 재배 구역 지정
            for (int j = 0 ; j < K ; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                arr[y][x] = 1;
            }
            for (int y = 0; y < N ; y++) {
                for (int x = 0; x < M ; x++) {
                    if (arr[y][x] == 1 && !visited[y][x] ){
                        bfs(y,x);
                        count ++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
