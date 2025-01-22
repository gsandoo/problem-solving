package com.algorithm.boj.solvedac.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 소수 {

    static int count  = 0;
    public static boolean isPrime(int n ){
        if (n < 2) return  false;
        else{
            for (int i =2; i*i <= n ; i++){
                if (n % i == 0) return false;
            }
            return  true;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0 ; i < n; i++){
            int p = Integer.parseInt(st.nextToken());
            if (isPrime(p)) count ++;
        }

        System.out.println(count);
    }
}
