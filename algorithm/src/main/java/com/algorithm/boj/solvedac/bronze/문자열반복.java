package com.algorithm.boj.solvedac.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 문자열반복 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] s = new String[N];
        for (int i = 0 ; i < N ; i ++) {
            StringBuilder sb = new StringBuilder();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            char[] chararr = st.nextToken().toCharArray();
            for (char x: chararr
                 ) {
                for (int k = 0 ; k < p ; k++) sb.append(x);
            }
            s[i] = sb.toString();
        }

        for (String x : s) {
            System.out.println(x);
        }
    }
}
