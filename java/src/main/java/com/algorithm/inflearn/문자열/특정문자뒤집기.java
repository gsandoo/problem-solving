/**
 * Author    : Kang San Ah
 * Date      : 2024.11.13(wed)
 * Runtime   : 1 sec
 * Memory    : 256 MB
 * Key point : Character.isAlphabetic -> 불리안 리턴 / 해당 문자가 알파벳이냐
 * Algorithm : 구현
 */

package com.algorithm.inflearn.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 특정문자뒤집기 {

    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] charStr = br.readLine().toCharArray();

        int lt = 0;
        int rt = charStr.length-1;

        while (lt < rt){
            if (!Character.isAlphabetic(charStr[lt])){
                lt ++;
            }
            else if (!Character.isAlphabetic(charStr[rt])){
                rt--;
            }
            else{
                char tmp = charStr[lt];
                charStr[lt] = charStr[rt];
                charStr[rt] = tmp;
                lt++;
                rt--;
            }
        }
        String answer = String.valueOf(charStr);
        System.out.println(answer);
    }
}

