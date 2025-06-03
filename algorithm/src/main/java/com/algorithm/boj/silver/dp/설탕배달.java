package com.algorithm.boj.silver.dp;

import java.io.*;
import java.util.*;


class 설탕배달 {
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int [] dp = new int[N+1];
        for (int i = 0 ; i <= N; i++) dp[i] = Integer.MAX_VALUE;

        if(N >= 3){
            dp[3] = 1;
        }

        if(N >= 5){
            dp[5] = 1;
            for(int i = 6 ; i <= N; i++) {
                if (i % 3 == 0 && i % 5 == 0){
                    if(dp[i-3] != Integer.MAX_VALUE && dp[i-5] != Integer.MAX_VALUE){
                        dp[i] = Math.min(dp[i-3] , dp[i-5]) + 1;
                    }
                }
                else if(i % 3 == 0){
                    dp[i] = dp[i-3] + 1;
                }
                else if(i % 5 == 0) {
                    dp[i] = dp[i-5] + 1;
                }
                else {
                    if(dp[i-3] != Integer.MAX_VALUE || dp[i-5] != Integer.MAX_VALUE){
                        dp[i] = Math.min(dp[i-3] , dp[i-5]) + 1;
                    }
                }
            }
        }

        if(dp[N] == Integer.MAX_VALUE) System.out.println(-1);
        else System.out.println(dp[N]);
    }
}

