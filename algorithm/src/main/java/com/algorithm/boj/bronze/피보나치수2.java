package com.algorithm.boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 피보나치수2 {
    static Long[] dp;
    public static long fib(int n){

        dp[0] = 0L;
        dp[1] = 1L;
        if (dp[n] == null) dp[n] = fib(n-2) + fib(n-1);

        return dp[n];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

         dp = new Long[N+1];

        System.out.println(fib(N));
    }
}
