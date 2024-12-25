package com.algorithm.inflearn.DFS_BFS_활용;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 메모이제이션 {

    static int[][] visited;
    static int n , r ;

    public static int dfs(int n, int r){
        if (n == r || r == 0) return 1;
        else{
            return dfs(n-1,r-1)+dfs(n-1,r);
        }
    }

    public static int dfs_memo(int n, int r) {
        if (visited[n][r] > 0) return visited[n][r];
        if (n == r || r == 0) return 1;
        else{
            return visited[n][r] = dfs(n-1,r-1)+dfs(n-1,r);
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());

        visited = new int[35][35]; // 요구사항

        long beforeTime = System.currentTimeMillis();
        System.out.println("dfs : " + dfs(n,r));
        long afterTime = System.currentTimeMillis();
        long time = (afterTime-beforeTime);
        System.out.println("[메모이제이션 전]dfs 수행 시간: " + time + "ms");

        System.out.println();

        long memo_beforeTime = System.currentTimeMillis();
        System.out.println("dfs with memo: " + dfs_memo(n,r));
        long memo_afterTime = System.currentTimeMillis();
        long memo_time = (memo_afterTime-memo_beforeTime);
        System.out.println("[메모이제이션 후]dfs 수행 시간: " + memo_time + "ms");
    }
}
