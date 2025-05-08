package com.algorithm.ktb.연결요소의개수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static boolean [] visited;
    public static StringTokenizer st;
    public static ArrayList<Integer>[] edge;
    public  static int V,E , x , y , count;

    public static void dfs (int n){
        visited[n] = true;
        for (int x : edge[n]){
            if (!visited[x]) {
                dfs(x);
            }
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());

        visited = new boolean[V+1];
        edge = new ArrayList[V+1];
        for (int i = 0 ; i < V + 1 ; i ++) edge[i] = new ArrayList<>();

        for (int i = 0 ; i < E ; i ++) {
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            edge[x].add(y);
            edge[y].add(x);
        }

        for (int i = 1 ; i <=V  ; i ++) {
            if (!visited[i]){
                dfs(i);
                count ++;
            }
        }
        System.out.println(count);
    }
}
