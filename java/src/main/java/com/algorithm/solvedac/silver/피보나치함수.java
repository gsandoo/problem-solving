package com.algorithm.solvedac.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class 피보나치함수 {

    static int N;
    static int[] array;
    static StringBuilder sb;

    public static void fabo(int n){


    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        array = new int[N];

        for (int i = 0 ; i < array.length; i++){
            array[i] = Integer.parseInt(br.readLine());
        }


    }
}
