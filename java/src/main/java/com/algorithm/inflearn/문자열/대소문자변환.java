/**
 * Author    : Kang San Ah
 * Date      : 2024.11.13(wed)
 * Runtime   : 1 sec
 * Memory    : 256 MB
 * Key point : toUpperCase(캐릭터), isUpperCase(불리언) 차이 알기
 * Algorithm : 구현
 */

package com.algorithm.inflearn.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 대소문자변환 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringBuilder sb = new StringBuilder();
        for (char x : str.toCharArray()){
            if (Character.isUpperCase(x)){
                sb.append(Character.toLowerCase(x));
            }else sb.append(Character.toUpperCase(x));
        }

        System.out.println(sb);
    }
}
