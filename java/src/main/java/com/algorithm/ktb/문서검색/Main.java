package com.algorithm.ktb.문서검색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String sli = br.readLine();
        int cnt = 0;
        while (str.length() != 0) {
            if (str.contains(sli)){
                str.replace(sli, "");
                cnt ++;
            }
        }
    }
}
