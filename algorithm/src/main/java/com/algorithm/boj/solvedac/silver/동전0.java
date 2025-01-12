package com.algorithm.boj.solvedac.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 동전0 {

    static int N, K, answer;
    static int [] arr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N= Integer.parseInt(st.nextToken());
        K= Integer.parseInt(st.nextToken());

        arr = new int[N];

        for (int i = 0 ; i < arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = N-1; i >= 0 ; i--) {
            if (arr[i] <= K){
               answer += (K/arr[i]);
               K = K%arr[i];
            }
        }

        System.out.println(answer);
    }
}
