package com.algorithm.solvedac.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

// tier: silver 2
// link:https://www.acmicpc.net/problem/11725
public class 트리의부모찾기 {

    static List<Integer>[] node;
    static int [] parent;
    static boolean [] visited;
    static int N;
    static StringTokenizer st;

    public static void dfs(int L){
        visited[L] = true;
        for (int x: node[L]){
            if (!visited[x]){
                parent[x] = L;
                dfs(x);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N= Integer.parseInt(br.readLine());

        node = new ArrayList[N+1];
        visited = new boolean[N+1];
        parent = new int[N+1];

        for (int i = 1 ; i <= N; i++){
            node[i] = new ArrayList();
        }

        for (int i =0 ; i < N-1; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            node[x].add(y);
            node[y].add(x);
        }

        dfs(1);

        for (int i = 2; i <= N; i++) {
            System.out.println(parent[i]);
        }
    }
}
