/**
 * Author    : Kang San Ah
 * Date      : 2024.11.13(wed)
 * Runtime   : 1 sec
 * Memory    : 256 MB
 * Key point : sb.indexOf(String.valueOf(str.charAt(i)))<0
 *             ----> 특정 문자로 sb에서 인덱스를 찾는데 0 이하다 => sb에 문자가 없다!
 *             고로 sb에 append 해라.
 * Algorithm : 구현
 */

package com.algorithm.inflearn.문자열;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 중복문자제거 {
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i < str.length(); i++){
            if (sb.length() == 0){
                sb.append(str.charAt(i));
            }
            else{
                if (sb.indexOf(String.valueOf(str.charAt(i)))<0){
                    sb.append(str.charAt(i));
                }
            }
        }
        System.out.println(sb.toString());
    }
}

