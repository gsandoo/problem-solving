package com.algorithm.boj.solvedac.bronze;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 아스키코드 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = (int)(br.readLine().charAt(0)); // 아스키 코드 형 변환
        System.out.println(N);

    }
}
