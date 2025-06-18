/**
 * Author    : Kang San Ah
 * Date      : 2024.11.13(wed)
 * Runtime   : 1 sec
 * Memory    : 256 MB
 * Key point : 길이를 구해 단어 추출 => 단순 구현. 이전 길이를 담는 변수 생성할 것
 * Algorithm : 구현
 */

package com.algorithm.inflearn.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문장속단어 {

    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        int cnt = 0;
        String words = "";
        for (String x : str){
            int len = x.length();
            if (len > cnt){
                cnt = len;
                words = x;
            }
        }
        System.out.println(words);
    }
}
