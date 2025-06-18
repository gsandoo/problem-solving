package com.algorithm.boj.silver.bfsdfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 숨바꼭질 {

    static boolean[] visited;
    static long[] arr;
    static Queue<Integer> q;
    static int N, M;

    public static long bfs(int n) {
        q = new LinkedList<>();
        q.offer(n);
        visited[n] = true;
        arr[n] = 0;

        while (!q.isEmpty()) {
            int p = q.poll();

            int[] moves = {p - 1, p + 1, p * 2};
            for (int np : moves) {
                if (np == M) {
                    return arr[p] + 1;
                }

                if (np >= 0 && np <= 100000 && visited[np] == false) {
                    visited[np] = true;
                    q.offer(np);
                    arr[np] = arr[p] + 1;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        visited = new boolean[100001];
        arr = new long[100001];

        System.out.println(N == M ? 0 : bfs(N));
    }
}
