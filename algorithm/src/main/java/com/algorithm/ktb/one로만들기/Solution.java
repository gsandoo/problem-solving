package com.algorithm.ktb.one로만들기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    // dfs 풀이 (시간 초과)
//    public static int[] d = {3,2,-1};
//    static int cnt = Integer.MAX_VALUE;
//
//    public static void dfs(int L, int n){
//
//        if (n == 1){
//            cnt = Math.min(cnt,L);
//        }
//        else{
//            for (int i = 0; i < d.length; i++){
//                if (d[i] != -1){
//                    if (n%d[i]==0) {
//                        dfs(L+1, n / d[i]);
//                    }
//                }else{
//                    dfs(L+1, n + d[i]);
//                }
//            }
//        }
//    }
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//        dfs(0, N);
//        System.out.println(cnt);
//
//    }
    //

    static int[] dp ;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N= Integer.parseInt(br.readLine());

        dp = new int[N+1];

        dp[1] = 0;

        for (int i = 2; i <= N; i++){
            dp[i] = dp[i-1] + 1;

            if (i % 2 == 0){
                dp[i] = Math.min(dp[i], dp[i/2] + 1);
            }

            if (i % 3 == 0){
                dp[i] = Math.min(dp[i], dp[i/3] + 1);
            }
        }

        System.out.println(dp[N]);
    }

}
