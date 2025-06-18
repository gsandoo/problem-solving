/**
 * Author    : Kang San Ah
 * Date      : 2024.11.13(wed)
 * Runtime   : 1 sec
 * Memory    : 256 MB
 * Key point : 거리 계산 -> 특정 index에서의 가장 짧은 거리를 구할 땐 -> 방향 1번, <- 방향 1번 돌기
 * Algorithm : 구현
 */

package com.algorithm.inflearn.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 가장짧은문자거리 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer t = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        String str = t.nextToken();
        String c = t.nextToken();
        String revStr = sb.append(str).reverse().toString();

        List<Integer> answer = new ArrayList<>();

        int p = 1000;
        for (char x : str.toCharArray()){
            if (!c.equals(String.valueOf(x)))p++;
            else p = 0;
            answer.add(p);
        }
        p = 1000;
        int ansLen = answer.size() - 1 ;
        for (char x : revStr.toCharArray()) {

            if (!c.equals(String.valueOf(x)))p++;
            else p = 0;
            int v = answer.get(ansLen);
            if (p < v){
                answer.remove(ansLen);
                answer.add(ansLen,p);
            }

            ansLen --;
        }

        for (int i = 0 ; i < answer.size(); i++){
            System.out.print(answer.get(i)+ " ");
        }
    }
}

