package com.algorithm.ktb.곱셈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static Long a,b,c;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        a = Long.parseLong(st.nextToken());
        b = Long.parseLong(st.nextToken());
        c = Long.parseLong(st.nextToken());

        System.out.println(pow(a,b));

    }

    public static long pow(Long base, Long exp){
        if (exp == 0) return 1;

        long temp = pow(base, exp / 2);
        temp = (temp * temp) % c;

        if (exp % 2 == 0) {
            return temp;
        } else {
            return (temp * base) % c;
        }
    }
}
