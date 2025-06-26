package com.algorithm.boj.silver.bfsdfs;

import java.io.*;
import java.util.*;

public class 연결요소의개수구하기 {
    static int n,m;
    static boolean[] visited;
    static List<Integer>[] list;

    public static void dfs(int node) {
        visited[node] = true;
        for (int next : list[node]) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        list = new List[n+1];
        visited = new boolean[n+1];

        for (int i = 1 ; i <= n; i++){
            list[i] = new ArrayList();
        }
        for (int i = 0 ; i < m ; i++){
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                list[a].add(b);
                list[b].add(a);
        }

        int answer = 0;
        for (int i = 1 ; i<=n;i++){
            if (!visited[i]){
                dfs(i);
                answer ++;
            }
        }
        System.out.println(answer);
    }
}
