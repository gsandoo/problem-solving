package com.algorithm.boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 수찾기 {

    static int [] a, b ,c;
    static  StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N  = Integer.parseInt(br.readLine());
        a= new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0 ; i < N; i++){
            a[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);

        int M  = Integer.parseInt(br.readLine());
        b= new int[M];
        c= new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0 ; i < M; i++){
            b[i] = Integer.parseInt(st.nextToken());
            c[i] = 0;
        }


        for (int i = 0 ; i < b.length; i++){
             if (Arrays.binarySearch(a,b[i]) >= 0) c[i] = 1;
        }

        for (int i = 0 ; i < c.length; i++) System.out.println(c[i]);
    }
}
