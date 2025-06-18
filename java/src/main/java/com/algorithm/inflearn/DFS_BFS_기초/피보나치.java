package com.algorithm.inflearn.DFS_BFS_기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 피보나치 {

    static int [] fibo;
    public static int dfs(int num){
        if (fibo[num] != 0) return fibo[num];
        if (num == 1 ) return fibo[num] = 1;
        else if (num == 2) {
            return fibo[num] = 1;
        } else {
            return fibo[num] = dfs(num-1) + dfs(num-2);
        }
    }

    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        fibo = new int[n+1];
        dfs(n);
        for (int i = 1 ; i <= n ; i ++) {
            // 1. 기초
            // System.out.print(dfs(i)+ " ");

            // 2. 기본
            System.out.print(fibo[i] + " ");
        }

    }
}
