package com.algorithm.inflearn.DFS_BFS_활용;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 동전교환 {
    static int N,M, answer = Integer.MAX_VALUE;
    static  int[] arr;

    public static void dfs(int level, int[] arr, int sum){
        if (level >= answer) return;
        if (sum > M) return;
        if (sum == M){
            answer = Math.min(answer,level);
        }
        else{
            for (int i = 0 ; i < arr.length; i++){
                dfs(level+1, arr, sum+arr[i]);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0 ; i < arr.length ; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        M = Integer.parseInt(br.readLine());

        dfs(0, arr, 0);
        System.out.println(answer);
    }
}
