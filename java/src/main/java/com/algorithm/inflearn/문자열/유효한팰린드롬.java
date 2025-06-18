/**
 * Author    : Kang San Ah
 * Date      : 2024.11.13(wed)
 * Runtime   : 1 sec
 * Memory    : 256 MB
 * Key point : 문자열 내 알파벳 외 나머지 요소 제거 => replaceAll
 * Algorithm : 구현
 */

package com.algorithm.inflearn.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 회문 문자열
public class 유효한팰린드롬 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toLowerCase().replaceAll("[^a-z]", "").toString();
        StringBuilder sb = new StringBuilder();
        String revStr = sb.append(str).reverse().toString();

        if (str.equals(revStr)) System.out.println("YES");
        else System.out.println("NO");

    }
}

