package com.algorithm.solvedac.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 계단오르기 {
    static int [] dp, arr;
    static int N;
    public static int solution(int [] arr){

        // 시작점
        dp[0] = arr[0];
        if (N >= 2) {
            dp[1] = arr[0] + arr[1];
            if ( N >= 3) {
                dp[2] = Math.max(arr[2] + arr[1], arr[2]+arr[0]);
                for (int i = 3 ; i < N ; i ++){
                    dp[i] = Math.max(arr[i]+ dp[i-2] , arr[i]+ dp[i-3] + arr[i-1]);
                }
            }
        }


        return dp[N-1];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N= Integer.parseInt(br.readLine());

        arr = new int[N];
        dp = new int[N];
        for (int i = 0 ; i  < N ; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(solution(arr));
    }
}
