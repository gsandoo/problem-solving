package com.algorithm.코딩테스트.구간합;

import java.io.*;
import java.util.*;

class Main{
    static StringTokenizer st;
    public static void main(String []args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n+1];
        int[] sum = new int[n+1];
        st = new StringTokenizer(br.readLine());

        for(int i = 1 ; i <= n ; i ++){
            arr[i] = Integer.parseInt(st.nextToken());
            sum[i] = sum[i-1] + arr[i];
        }

        for(int i = 0 ; i < m ; i ++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            System.out.println(sum[end] - sum[start-1]);
        }
    }
}