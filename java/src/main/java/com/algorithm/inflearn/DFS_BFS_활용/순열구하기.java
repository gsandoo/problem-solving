package com.algorithm.inflearn.DFS_BFS_활용;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 순열구하기 {

    static int  n, m;
    static int[] arr, visited, pm;

    static StringTokenizer st;

    public static void dfs(int level, int[] arr){
        if(level == m) {
            for (int x: pm)System.out.print(x+" ");
            System.out.println();
        }else{
            for (int i = 0; i< arr.length;i++){
                if(visited[i] == 0) {
                    pm[level] = arr[i];
                    visited[i] = 1;
                    dfs(level+1, arr);
                    visited[i] = 0; // 중복 방지
                }
            }
        }
    }

    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n];
        visited = new int[n];
        pm = new int[m];

        st = new StringTokenizer(br.readLine());

        for (int i = 0 ; i < arr.length ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0,arr);
    }
}
