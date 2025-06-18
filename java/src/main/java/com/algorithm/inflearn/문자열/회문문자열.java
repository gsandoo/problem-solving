/**
 * Author    : Kang San Ah
 * Date      : 2024.11.13(wed)
 * Runtime   : 1 sec
 * Memory    : 256 MB
 * Key point : 회문 문자열 문제 -> lt,rt 사용하지말고 sb 활용(오답의 수를 최소화 가능)
 * Algorithm : 구현
 */

package com.algorithm.inflearn.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class 회문문자열 {

    // 1번째 방법 , lt, rt 사용 / 오답 처리 발생
//    public static void main(String[] args)throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        char[] words = br.readLine().toLowerCase().toCharArray();
//        int lt = 0; int rt = words.length-1;
//
//        String answer = "YES";
//        while (lt < rt){
//            if (words.length%2 > 0){
//                answer = "NO";
//                break;
//            }
//            else if (words[lt] != words[rt]){
//                answer = "NO";
//                break;
//            }
//            else{
//                lt++;
//                rt--;
//            }
//        }
//        System.out.println(answer);
//    }

    // 2번째 방법 StringBuilder 사용하기 / 정답 / 회문 문제의 경우 sb 활용(reverse) -> 오답의 수를 최소화 할 수 있음
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine().toLowerCase().toString();
        String rev = sb.append(str.toLowerCase()).reverse().toString();

        if (str.equals(rev)) System.out.println("YES");
        else System.out.println("NO");
    }
}

