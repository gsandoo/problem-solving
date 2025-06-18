package com.algorithm.inflearn.DFS_BFS_기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 송아지찾기 {

    static int N, M, L;
    static boolean[] visited;
    static int[] dis = { 1, -1, 5 };

    static Queue<Integer> q = new LinkedList<>();

    public static int bfs(int L, int N) {
        visited[N] = true;
        q.offer(N);

        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0 ; i < len; i ++){
                int x = q.poll();
                for (int j = 0 ; j < dis.length; j++) {
                    int nx = x + dis[j];
                    if (nx == M) return L;
                    if (nx >=1 && nx <= 10000 && visited[nx] == false){
                        q.offer(nx);
                        visited[nx] = true;
                    }
                }
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visited = new boolean[10001];

        System.out.println(bfs(1, N));

    }
}
