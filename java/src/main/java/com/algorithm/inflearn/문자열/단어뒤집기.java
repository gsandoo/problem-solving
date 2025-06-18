/**
 * Author    : Kang San Ah
 * Date      : 2024.11.13(wed)
 * Runtime   : 1 sec
 * Memory    : 256 MB
 * Key point : StringBuilder 사용 -> 문자열 조합기
 * Algorithm : 구현
 */

package com.algorithm.inflearn.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class 단어뒤집기 {

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<String> list = new ArrayList<>();
        for (int i = 0 ; i < N ; i++){
           list.add(new StringBuilder(br.readLine()).reverse().toString());
        }

        for (int i = 0 ; i < list.size() ; i++){
            System.out.println(list.get(i));
        }
    }

}

