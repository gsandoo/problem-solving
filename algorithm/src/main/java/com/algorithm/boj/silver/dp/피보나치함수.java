package com.algorithm.boj.silver.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 피보나치함수 {

    static int [] answer, arr;
    static int N;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        arr = new int[N];
        answer = new int[2];

        for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(br.readLine());




    }
}
