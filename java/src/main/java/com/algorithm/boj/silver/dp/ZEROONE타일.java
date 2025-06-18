package com.algorithm.boj.silver.dp;


import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int [] arr = new int[N];

        if(N == 1) {
            System.out.println(1);
        }else{
            arr[0] = 1;
            arr[1] = 2;
            for (int i = 2 ; i < N; i++) arr[i] = (arr[i-1] + arr[i-2]) % 15746;
            System.out.println(arr[N-1]);
        }
    }
}
