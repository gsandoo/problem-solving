package com.algorithm.ktb.ATM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int [] arr = new int[N+1];
        arr[0] = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1 ; i < arr.length ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int [] dp = new int[N + 1];
        dp[1] = arr[1];

        for (int i = 2 ; i <= N ; i++){
            dp[i] =   dp[i-1] + arr[i];
        }
        int answer = 0;
        for (int x : dp) {answer += x;}
        System.out.println(answer);
    }
}
