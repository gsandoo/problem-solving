package com.algorithm.solvedac.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// tier: silver 3
// link:https://www.acmicpc.net/problem/15654
public class N과M5 {

    static int [] arr, made;
    static boolean [] visited;
    static int N,M;
    static StringTokenizer st;

    public static void dfs(int L){
        if (L == M){
            for (int m : made) System.out.print(m + " ");
            System.out.println();
        }else{
            for (int i = 0; i < arr.length; i++){
                if (!visited[i]){
                    visited[i] = true;
                    made[L] = arr[i];
                    dfs(L+1);
                    visited[i] = false;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];
        made = new int[M];
        visited = new boolean[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0 ; i < arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr); // 오름차순 정렬
        dfs(0 );
    }
}
