package com.algorithm.ktb.헌내기는친구가필요해;

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
    static int N, M, c;

    static boolean[][] visited;
    static char [][] arr;
    static Queue<Point> q;

    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};

    static void bfs(int x, int y){
        c = 0;
        q = new LinkedList<>();
        q.offer(new Point(x,y));
        visited[x][y] = true;

        while (!q.isEmpty()){
            Point np = q.poll();
            for (int i = 0 ; i < 4; i++) {
                int nx = np.x + dx[i];
                int ny = np.y + dy[i];
                if (nx >=0 && nx < N && ny >=0 && ny < M && visited[nx][ny] == false && (arr[nx][ny] == 'O' || arr[nx][ny] == 'P')){
                    if ( arr[nx][ny] == 'P') c ++;
                    visited[nx][ny] = true;
                    q.offer(new Point(nx,ny));
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new char[N][M];
        visited = new boolean[N][M];

        for (int i = 0 ; i < N; i++){
            char[] str = br.readLine().toCharArray();
            for (int j = 0 ; j < M; j++) {
                arr[i][j] = str[j];
            }
        }

        for (int i = 0 ; i < N; i ++) {
            for (int j = 0 ; j < M; j++) {
                if (arr[i][j] == 'I') bfs(i,j);
            }
        }
        if (c == 0) System.out.println("TT");
        else System.out.println(c);

    }
}
