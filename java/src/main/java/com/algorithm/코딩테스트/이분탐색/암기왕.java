package com.algorithm.코딩테스트.이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 암기왕 {
    static StringTokenizer st;
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int t = 0 ; t < T; t++){
            int N = Integer.parseInt(br.readLine());

            int [] arr = new int[N];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);

            int M = Integer.parseInt(br.readLine());

            int [] narr = new int[M];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < M; i++) {
                narr[i] = Integer.parseInt(st.nextToken());
            }


            for (int i = 0 ; i < narr.length; i++){
                if (search(arr, narr[i])) sb.append("1" + '\n');
                else sb.append("0" + '\n');
            }
        }
        System.out.println(sb.toString());

    }
    static  boolean search (int[]arr, int target){
        int start = 0 ; int last = arr.length-1;
        while (start <= last) {
            int mid = (start + last) / 2;
            if (arr[mid] < target) {
                start = mid  + 1 ;
            }else if( arr[mid] > target){
                last = mid - 1;
            }else if (arr[mid] == target) return true;
        }
        return false;
    }
}


