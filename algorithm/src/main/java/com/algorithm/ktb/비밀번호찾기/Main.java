package com.algorithm.ktb.비밀번호찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String,String> hm = new HashMap<>();

        for (int i = 0 ; i < N; i ++) {
            st = new StringTokenizer(br.readLine());
            hm.put(st.nextToken(), st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i < M; i++) {
            String key = br.readLine();
            sb.append(hm.get(key) + '\n');
        }

        System.out.println(sb);
    }
}
