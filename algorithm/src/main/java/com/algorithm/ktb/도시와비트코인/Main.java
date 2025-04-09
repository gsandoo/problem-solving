package com.algorithm.ktb.도시와비트코인;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Point {
    int y;
    int x;
    Point(int y, int x) {
        this.y = y;
        this.x = x;
    }
}

public class Main {
    static int[][] arr;
    static boolean[][] visited;
    static int N, M;
    static StringTokenizer st;
    static int[] dx = {1, 0}; // 오른쪽
    static int[] dy = {0, 1}; // 아래쪽
    static Queue<Point> queue = new LinkedList<>();

    public static String bfs() {

        queue.offer(new Point(0, 0));
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            Point p = queue.poll();
            if(p.y == M-1 && p.x == N-1) return "Yes";
            for (int i = 0; i < 2; i++) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];

                if (nx >= 0 && nx < N && ny >= 0 && ny < M && !visited[ny][nx] && arr[ny][nx] == 1) {
                    queue.offer(new Point(ny, nx));
                    visited[ny][nx] = true;
                }
            }
        }
        return "No";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M][N];
        visited = new boolean[M][N];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(bfs());
    }
}
