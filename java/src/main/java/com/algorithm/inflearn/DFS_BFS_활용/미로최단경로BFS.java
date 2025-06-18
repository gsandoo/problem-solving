package com.algorithm.inflearn.DFS_BFS_활용;

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

public class 미로최단경로BFS {
    static int[] dx = {-1, 0 , 1, 0};
    static int[] dy = {0, 1 , 0, -1};

    static int [][] arr, dis;
    static Queue<Point> q;

    public static void bfs(int x, int y){
        q = new LinkedList<>();
        q.offer(new Point(x,y));
        arr[x][y] = 1;
        while (!q.isEmpty()){
            Point tmp = q.poll();
            for (int i = 0 ; i < 4; i++){
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && arr[nx][ny] == 0){
                    q.offer(new Point(nx,ny));
                    arr[nx][ny] = 1; // 벽 처리
                    dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        arr = new int[8][8];
        dis = new int[8][8];

        for (int i = 1; i<= 7; i++ ){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1 ; j <= 7 ; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        bfs(1,1);

        if (dis[7][7] == 0) System.out.println(-1);
        else System.out.println(dis[7][7]);
    }
}
