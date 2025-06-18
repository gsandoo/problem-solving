package com.algorithm.boj.silver.dp;

import java.io.*;
import java.util.*;

class 정수삼각형 {
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int [][] arr = new int[N][N];
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j <= i; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int answer = 0;
        for(int i = 1; i < N; i++) {
            for(int j = 0 ; j < N; j++){
                if(j == 0) arr[i][j] += arr[i-1][j];
                else if(j == arr[i].length-1) arr[i][j] += arr[i-1][j-1];
                else {
                    arr[i][j] += Math.max(arr[i-1][j-1], arr[i-1][j]);
                }
            }
        }

        for(int i = 0 ; i < arr[N-1].length; i++){
            answer = Math.max(answer, arr[N-1][i]);
        }
        System.out.println(answer);
    }
}
