package com.algorithm.ktb.피보나치함수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
//    public static int zero = 0;
//    public static int one = 0;
//    public static int fibo(int n){
//        if (n == 0) {
//            zero ++;
//            return 0;
//        }if (n == 1) {
//            one ++;
//            return 1;
//        }else{
//            return fibo(n-1) + fibo(n-2);
//        }
//    }
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//
//        ArrayList<Integer[]> arr = new ArrayList<>();
//        for (int i = 0; i < N ; i++){
//            fibo(Integer.parseInt(br.readLine()));
//            arr.add(new Integer[]{zero,one});
//            zero = 0;
//            one = 0;
//        }
//
//        for (Integer[] x : arr) System.out.println(x[0]+ " " + x[1]);
//    }

    /**
     * dp로 풀어야 효율적!
     * dp[0][0] = fibo 0을 호출할 때 0이 호출된 횟수
     * dp[1][0] = fibo 1을 호출할 때 0이 호출된 횟수
     *
     * **/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N= Integer.parseInt(br.readLine());

        int [][] dp = new int[41][2];

        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;

        for (int i = 2 ; i <= 40; i++) {
            dp[i][0] = dp[i-1][0] + dp[i-2][0];
            dp[i][1] = dp[i-1][1] + dp[i-2][1];
        }

        for (int i = 0 ; i < N; i++){
            int n = Integer.parseInt(br.readLine());
            System.out.println(dp[n][0] + " " + dp[n][1]);
        }
    }
}
