package com.algorithm.inflearn.DFS_BFS_기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 그래프최단거리 {

    static boolean[] visited;
    static int n,m, x,y;
    static  int [] dis;
    static List[] arr;

    static Queue<Integer> q = new LinkedList<>();
    static StringTokenizer st;

    static void bfs (int l) {
        visited[l] = true;
        dis[1] = 0;
        q.offer(l);
        while (!q.isEmpty()){
            int p = q.poll();
            for (int i = 0 ; i < arr[p].size(); i ++){
                int x = (int) arr[p].get(i);
                if (visited[x] == false){
                    visited[x] = true;
                    dis[x] = dis[p]+1;
                    q.offer(x);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken()); // 6
        m = Integer.parseInt(st.nextToken()); // 9

        visited = new boolean[n + 1];
        dis = new int[n + 1];

        arr = new List[n+1];

        for (int i = 1 ; i <= n ; i++) {
            arr[i] = new ArrayList<>();
        }


        for (int i = 0 ; i < m ; i ++) {
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            arr[x].add(y);
        }

        bfs(1);

        for (int i = 2; i < dis.length; i++){
            System.out.println(i+":"+ dis[i]);
        }
    }

}
