package com.algorithm.boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 구간합구하기2 {
    static StringTokenizer st;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][]arr = new int[n][n];

        for (int i = 0 ; i < n; i ++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0 ; j < n; j ++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int [][] sumArr = new int[n][n];
        sumArr[0][0] = arr[0][0];

        for (int i = 1; i < n; i++){
            sumArr[0][i] = sumArr[0][i-1] + arr[0][i];
            sumArr[i][0] = sumArr[i-1][0] + arr[i][0];
        }

        for(int i = 1 ; i < n ; i ++) {
            for (int j = 1; j < n; j++){
                sumArr[i][j] = sumArr[i][j-1] + sumArr[i-1][j] - sumArr[i-1][j-1] + arr[i][j];
            }
        }

        for (int i = 0 ; i < m ; i++){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            int result = sumArr[x2][y2] - sumArr[x1-1][y2] - sumArr[x2][y1-1] + sumArr[x1-1][y1-1];
            System.out.println(result);
        }
    }
}
