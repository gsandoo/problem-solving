package com.algorithm.boj.silver.dp;

import java.util.*;
import java.io.*;

public class RGB거리 {

    static StringTokenizer st;

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int [][] arr = new int [N][3]; // rgb 3개
        int [][] dp = new int [N][3];

        for(int i = 0 ; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j  < 3 ;j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 초기화
        for(int i = 0 ; i < 1 ; i ++) {
            for(int j = 0 ; j < 3; j ++) {
                dp[i][j] = arr[i][j]; // 26, 40, 83
            }
        }

        for(int i = 1; i < N ; i ++){
            for(int j = 0; j < 3; j++){
                // R 선택
                if(j == 0) dp[i][j] = arr[i][j] + Math.min(dp[i-1][j+1],dp[i-1][j+2]);
                // G 선택
                if(j == 1) dp[i][j] = arr[i][j] + Math.min(dp[i-1][j-1],dp[i-1][j+1]);
                // B 선택
                if(j == 2) dp[i][j] = arr[i][j] + Math.min(dp[i-1][j-2],dp[i-1][j-1]);
            }
        }

        int answer = Integer.MAX_VALUE;

        for(int i = N-1; i < N; i ++){
            for(int j = 0 ; j < 3 ; j++) {
                answer = Math.min(answer, dp[i][j]);
            }
        }

        System.out.println(answer);
    }

}
