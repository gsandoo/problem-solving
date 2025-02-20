package com.algorithm.boj.silver.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 퇴사 {

    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] dp = new int[N+1];
        int[] T = new int[N];
        int[] P = new int[N];
        for (int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            T[i] = Integer.parseInt(st.nextToken());
            P[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0 ; i < N; i++){
            if (i+T[i] <= N){
                dp[i+T[i]]=Math.max(dp[i+T[i]],dp[i]+P[i]); // 0 , 0+10
            }
            dp[i+1] = Math.max(dp[i], dp[i+1]);
        }

        System.out.println(dp[N]);
    }
}
