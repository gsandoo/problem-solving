package com.algorithm.boj.silver.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 파도반수열 {

    static long[] dp = new long[101];
    static int N;

    public static void pre(){

        dp[1] = dp[2] = dp[3] = 1;

        for (int i = 4; i < 101; i ++){
            dp[i] = dp[i-2] + dp[i-3];
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        pre();

        for (int i = 0 ; i < N ; i++){
            int n = Integer.parseInt(br.readLine());
            System.out.println(dp[n]);
        }
    }
}
