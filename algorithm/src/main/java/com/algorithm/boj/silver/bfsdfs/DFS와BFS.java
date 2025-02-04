package com.algorithm.boj.silver.bfsdfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class DFS와BFS {

    static boolean[] visited ;
    static int count , x, y , n , m, l ;
    static List[] nodes;
    static Queue<Integer> q;
    static StringBuilder sb = new StringBuilder();


    public static void dfs(int l){
        if (visited[l] == true) return;
        else{
            visited[l] = true;
            sb.append(l+ " ");
            for (int i = 0 ; i < nodes[l].size() ; i++){
                dfs((int)nodes[l].get(i));
            }
        }
    }

    public static void bfs(int l){
        q = new LinkedList<>();
        q.offer(l);
        visited[l] = true;

        while (!q.isEmpty()){
            int polled = q.poll();
            sb.append(polled+ " ");
            for (int i = 0 ; i < nodes[polled].size(); i++){
                int next = (int)nodes[polled].get(i);
                if (!visited[next]){
                    q.offer(next);
                    visited[next] = true;
                }
            }
        }

    }




    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        l = Integer.parseInt(st.nextToken());

        visited = new boolean[n + 1];
        nodes = new List[n + 1];

        for (int i = 0 ; i < nodes.length ; i++) {
            nodes[i] = new ArrayList<>();
        }

        for (int i = 0 ; i < m ; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            nodes[x].add(y);
            nodes[y].add(x);
            Collections.sort(nodes[x]);
            Collections.sort(nodes[y]);
        }

        dfs(l);
        System.out.println(sb.toString());
        sb = new StringBuilder();
        visited = new boolean[ n + 1 ];
        bfs(l);
        System.out.println(sb.toString());
    }
}
