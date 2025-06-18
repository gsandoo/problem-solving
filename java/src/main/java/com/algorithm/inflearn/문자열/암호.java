/**
 * Author    : Kang San Ah
 * Date      : 2024.11.18(mon)
 * Runtime   : 1 sec
 * Memory    : 256 MB
 * Key point :
 *              1. subString : 문자열 잘라서 비교 -> for문 돌면서 s=s.subString(7); 같은 형식으로 7자리 씩 잘라서 검증 가능
 *              2. replace('*', '1') : 문자열을 치환
 *              3. int tmp -> (char)tmp : 캐스팅. 65->A 와 같은 형식으로 변환됨.
 * Algorithm : 구현
 */


package com.algorithm.inflearn.문자열;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class 암호 {
    public static void main(String[] args)throws IOException {
        StringBuilder answer = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        String line = br.readLine();

        for (int i = 0 ; i < Integer.parseInt(n) ; i++){
            String tmp = line.substring(0,7).replace('#', '1').replace('*', '0');
            int ascii = Integer.parseInt(tmp,2);

            answer.append((char)ascii);
            line = line.substring(7);
        }
        System.out.println(answer.toString());
    }
}

