package com.algorithm.inflearn.DFS_BFS_활용;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 동전교환 {
    static int N,M, count, answer = Integer.MAX_VALUE;
    static  int[] arr;

    public static void dfs(int level, int[] arr, int sum, int count){
        if (sum > M) return;
        if (level == N) return;
        if (sum == M){
            answer = Math.min(answer,count);
            count = 0;
            sum = 0;
        }
        else{
            sum += arr[level];
            dfs(level+1, arr, sum+arr[level], count+1);
            dfs(level+1, arr, sum, count+1);
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
        count = 0;
        dfs(0, arr, 0, count);
        System.out.println(count);
    }
}
