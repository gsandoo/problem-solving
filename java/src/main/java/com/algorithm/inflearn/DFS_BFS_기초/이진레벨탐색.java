package com.algorithm.inflearn.DFS_BFS_기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 이진레벨탐색 {

    static int n, m, x, y;
    static StringBuilder sb = new StringBuilder();
    static Queue<Integer> q;
    static boolean [] visited;
    static List[] node;

    public static void bfs (int start) {
        q = new LinkedList<>();
        q.offer(start);
        visited[start] = true;
        while (!q.isEmpty()){
            int p = q.poll();
            sb.append(p + " ");
            for (int i = 0 ; i < node[p].size(); i++) {
                int s = (int)node[p].get(i);
                if (!visited[s]){
                    q.offer(s);
                    visited[s] = true;
                }
            }
        }
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        node = new List[ n + 1];
        visited = new boolean[ n + 1];
        for (int i = 0 ; i < node.length; i++){
            node[i] = new ArrayList<>();
        }

        for (int i = 0 ; i < m ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

            node[x].add(y);
            node[y].add(x);
        }

        bfs(1);

        System.out.println(sb.toString());
    }
}
