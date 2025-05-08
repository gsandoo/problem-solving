package com.algorithm.boj.silver.dp;

import com.algorithm.oriented_programming2023_2.linkedList.Point;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.*;

// https://www.acmicpc.net/problem/11659
public class 구간합구하기4 {

    static int N, M, i, j;
    static int[] arr, dp;
    static StringTokenizer st;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N+1];
        dp = new int[N+1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i  <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            dp[i] = dp[i-1] + arr[i];
        }

        for (int x = 0 ; x < M; x++){
            st = new StringTokenizer(br.readLine());
            i = Integer.parseInt(st.nextToken());
            j = Integer.parseInt(st.nextToken());
            System.out.println(dp[j]-dp[i-1]);
        }

        HashSet<Point> sh = new HashSet<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        //hm.
    }

}
