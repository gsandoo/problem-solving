package com.algorithm.inflearn.DFS_BFS_활용;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 합이같은부분집합 {

    static int N, total;
    static String answer = "NO";

    static boolean flag = false;
    private static void dfs(int L, int sum,int[] arr){
       if (flag) return;
       if (L == N){
           if (total / 2 == sum) answer = "YES";
           flag = true;
       }else{
           dfs(L+1, sum+arr[L], arr);
           dfs(L+1, sum, arr);
       }
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0 ; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            total += arr[i];
        }
        dfs(0,0, arr);
        System.out.println(answer);
    }
}
