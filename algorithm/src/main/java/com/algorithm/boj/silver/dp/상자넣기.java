package com.algorithm.boj.silver.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/1965
public class 상자넣기 {

    static int [] box, dp;
    static int N;

    public static int solution(int n){
        dp = new int[n];
        Arrays.fill(dp,1);
        for (int i = 0 ; i < box.length; i++){
            for (int j = 0 ; j < i ; j++){
                if (box[j]<box[i]){
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
        }
        return Arrays.stream(dp).max().getAsInt();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        box = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0 ; i < N ; i ++){
            box[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(N));
    }
}
