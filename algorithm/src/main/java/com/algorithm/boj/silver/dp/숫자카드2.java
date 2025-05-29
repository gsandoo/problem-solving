package com.algorithm.boj.silver.dp;

import java.io.*;
import java.util.*;

class 숫자카드2 {
    static StringTokenizer st;

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int [] arr = new int[N];
        for (int i = 0 ; i < N; i ++) arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr); // -10 -10 2 3 3 6 7 10 10 10

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int [] find = new int[M];
        for (int i = 0 ; i < M; i ++) find[i] = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        for (int x: find) {
            sb.append((upperBound(arr,x) - lowerBound(arr, x)) + " ");
        }
        System.out.println(sb.toString());
    }

    static int upperBound(int [] arr , int x) {
        int left = 0 ; int right = arr.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] <= x) {
                left = mid + 1;
            }else {
                right = mid;
            }
        }
        return  left;
    }

    static int lowerBound(int [] arr, int x) {
        int left = 0 ; int right = arr.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] < x) {
                left = mid  + 1 ;
            }else {
                right = mid;
            }
        }
        return  left;
    }
}
