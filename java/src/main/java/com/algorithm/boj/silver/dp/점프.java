package com.algorithm.boj.silver.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 점프 {
    static int N;
    static int [][] list;
    static long[][]dp;

    public static int solution(int[][]list){
        dp[0][0] = 1;
        for (int i = 0 ; i < N; i++){
            for (int j = 0 ; j < N; j++){
                int nxt = list[i][j];
                if (nxt == 0) continue;
                if (j + nxt < N) dp[i][j+nxt] += dp[i][j];
                if (i + nxt < N) dp[i+nxt][j] += dp[i][j];
            }
        }


        return (int) dp[N-1][N-1];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        list = new int[N][N];
        dp = new long[N][N];

        for (int i = 0 ; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0 ; j < N; j++){
                list[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(solution(list));
    }
}
