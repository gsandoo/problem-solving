package com.algorithm.ktb.귀찮음;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static Long[] arr;
    static int N;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        arr = new Long[N];
        long total = 0;
        for (int i = 0 ; i < N; i++){
            arr[i] = Long.parseLong(st.nextToken());
            total += arr[i];
        }

        Arrays.sort(arr);

        long sum = 0;
        for (int i = 0 ; i < arr.length ; i++){
            total -= arr[i];
            sum  += arr[i] * total;
        }

        System.out.println(sum);
    }
}
