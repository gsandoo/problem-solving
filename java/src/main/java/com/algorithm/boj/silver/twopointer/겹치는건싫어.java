package com.algorithm.boj.silver.twopointer;

import java.util.*;
import java.io.*;

class 겹치는건싫어 {
    static StringTokenizer st;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        Map<Integer,Integer> map = new HashMap<>();


        int L = 0 ;
        int R = 0 ;

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N; i ++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int maxLen = 0;
        while(R < N){
            // 클 때
            if(map.getOrDefault(arr[R], 0) + 1 > M){
                int val =  map.get(arr[L]);
                map.put(arr[L] , --val);
                L ++ ;
            }else{
                map.put(arr[R], map.getOrDefault(arr[R], 0) + 1);
                R++;
            }
            maxLen = Math.max(maxLen, R - L);
        }

        System.out.println(maxLen);
    }
}