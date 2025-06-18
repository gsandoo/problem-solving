/**
 * Author    : Kang San Ah
 * Date      : 2024.11.13(wed)
 * Runtime   : 1 sec
 * Memory    : 256 MB
 * Key point :  1. 문자열 to char [] => br.toCharArray
 *              2. 문자 받는 법 => (char)br.read()
 *              3. 옵션 => 어퍼케이스는 Character.toUpperCase / br.readline().toUpperCase()
 * Algorithm : 구현
 */

package com.algorithm.inflearn.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class 문자찾기 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int answer = 0;

        char[] str = br.readLine().toUpperCase().toCharArray();
        char alpha = Character.toUpperCase((char)br.read());

        for (char x: str){
            if (x == alpha){
              answer++;
            }
        }
        System.out.println(answer);
    }
}