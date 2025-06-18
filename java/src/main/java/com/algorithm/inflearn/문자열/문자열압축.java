/**
 * Author    : Kang San Ah
 * Date      : 2024.11.18(mon)
 * Runtime   : 1 sec
 * Memory    : 256 MB
 * Key point : 제약 조건 나열한 후 코드 간소화
 * Algorithm : 구현
 */

package com.algorithm.inflearn.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문자열압축 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringBuilder sb = new StringBuilder();

        int count = 1;
        for (char x : str.toCharArray()) {

            if ((sb.length() == 0) || (count < 2  && x != sb.charAt(sb.length()-1))) sb.append(x);
            else if (count >= 2  && x != sb.charAt(sb.length()-1)){
                sb.append(count);
                sb.append(x);
                count = 1;
            }
            else if (x == sb.charAt(sb.length()-1)) count ++;
        }
        if (count >= 2) sb.append(count);
        System.out.println(sb.toString());
    }
}

