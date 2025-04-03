package com.algorithm.ktb.알고리즘수업깊이우선탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    static boolean[] visited;
    static ArrayList<Integer>[] graph;
    static int[] answer;
    static StringTokenizer st;
    static int count =1  ;
    static int N, M;

    public static void dfs(int node) {
        visited[node] = true;
        answer[node] = count++;

        for (int next : graph[node]) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());


        visited = new boolean[N+1];
        graph = new ArrayList[N+1];

        for (int i =  1 ; i <= N ; i++){
            graph[i] = new ArrayList<>();
        }

        for (int i = 1 ; i <= M; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x].add(y);
            graph[y].add(x);
        }

        answer = new int[N+1];

        for (int i = 1; i <= N; i++) {
            Collections.sort(graph[i]); // 오름차순 정렬
        }

        dfs(start);

        for (int i = 1; i <= N; i++) {
            System.out.println(answer[i]);
        }


    }
}
