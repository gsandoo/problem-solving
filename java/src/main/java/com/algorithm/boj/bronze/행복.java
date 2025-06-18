package com.algorithm.boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 행복 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st =new StringTokenizer(br.readLine());

        int [] arr = new int[N];
        for (int i = 0 ; i < N ; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[arr.length-1];

        System.out.println(max - min);
    }
}
