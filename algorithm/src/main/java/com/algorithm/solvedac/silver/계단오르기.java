package com.algorithm.solvedac.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 계단오르기 {
    static int [] dp, arr;
    static int N;
    public static int solution(int [] dp){
        int answer = 0;

        dp[0] = arr[0];
        if (N >= 2) dp[1] = arr[0]+arr[1];

        dp[N] = Math.max(dp[N-2], dp[N-3]+arr[N-1])+ arr[N];
        answer = dp[N];
        return answer;
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
