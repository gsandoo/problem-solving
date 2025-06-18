package com.algorithm.boj.silver.bfsdfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


class PointMiro {
    int x;
    int y;
    PointMiro(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class 미로탐색 {
    static StringTokenizer st;
    static int N,M,count;
    static Queue<PointMiro> q;
    static int[][] arr;
    static boolean[][] visited;

    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static String[] line ;
    public static int bfs(int x, int y){
        q = new LinkedList<>();
        PointMiro cp = new PointMiro(x,y);
        q.offer(cp);
        visited[x][y] = true;
        while(!q.isEmpty()){
            PointMiro p = q.poll();
            for (int i = 0 ; i < 4; i ++){
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];
                if (nx >= 0 && nx < N && ny >= 0 && ny <M && visited[nx][ny] == false && arr[nx][ny] == 1){
                    visited[nx][ny] = true;
                    q.offer(new PointMiro(nx,ny));
                    arr[nx][ny] = arr[p.x][p.y] + 1;
                }
            }
        }
        return arr[N-1][M-1];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int [N][M];
        visited = new boolean [N][M];

        for (int x = 0 ; x < N; x++){
            line = br.readLine().split("");
            for (int y = 0 ; y < M; y++){
                arr[x][y] = Integer.parseInt(line[y]);
            }
        }

        System.out.println(bfs(0,0));

    }
}
