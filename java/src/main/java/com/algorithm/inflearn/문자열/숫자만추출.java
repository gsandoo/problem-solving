/**
 * Author    : Kang San Ah
 * Date      : 2024.11.13(wed)
 * Runtime   : 1 sec
 * Memory    : 256 MB
 * Key point : replaceAll("[a-z]", "") -> 문자열 내 a~z 알파벳 없애기
 * Algorithm : 구현
 */

package com.algorithm.inflearn.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 숫자만추출 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[] str = br.readLine().toLowerCase().replaceAll("[a-z]" ,"").toCharArray();
        for (char x : str){
            if(sb.length() == 0 && Integer.parseInt(String.valueOf(x)) == 0) continue;
            sb.append(Integer.parseInt(String.valueOf(x)));
        }
        System.out.println(sb.toString());

    }
}

