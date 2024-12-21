package com.algorithm.inflearn.DFS_BFS_활용;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 합이같은부분집합 {

    static String answer = "NO";
    static boolean flag = false;
    static int N, total = 0;

    public static void dfs(int L, int sum, int[]arr) {
        if (flag) return;
        if (L == N) {
            if (total/2 == sum) {
                flag = true;
                answer = "YES";
            }
        }
        else{
            dfs(L+1, sum+arr[L], arr);
            dfs(L+1, sum, arr);
        }
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        String [] nStr = br.readLine().split(" ");
        int[] arr = new int[nStr.length];
        for (int i = 0 ; i < nStr.length; i++) {
            arr[i] = Integer.parseInt(nStr[i]);
            total += arr[i];
        }
        dfs(0,0, arr);
        System.out.println(answer);
    }
}
