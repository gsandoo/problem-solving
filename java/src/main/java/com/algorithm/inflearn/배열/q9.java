package com.algorithm.inflearn.배열;

import java.util.Scanner;

// 격자판 최대합
public class q9 {
    public int solution(int N , int[][]s) {
        int sum1 = 0, sum2 = 0;
        int answer = Integer.MIN_VALUE;
        for (int i = 0 ; i <  N  ; i++){
            for (int j = 0 ; j < N ; j++){
                sum1 += s[i][j];
                sum2 += s[j][i];
            }
            answer = Math.max(answer,sum1);
            answer = Math.max(answer,sum2);
        }
        sum1 =sum2=0;
        for (int i = 0 ; i < N ; i++ ){
            sum1 += s[i][i];
            sum2 += s[i][N-i-1];
        }
        answer = Math.max(answer,sum1);
        answer = Math.max(answer,sum2);
        return  answer;
    }

    public static void main(String[] args) {
        q9 T = new q9();
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int[][] s = new int[N][N];
        for (int i = 0 ; i < N ; i++){
            for (int j = 0 ; j < N ; j++){
                s[i][j] = kb.nextInt();
            }
        }
        System.out.println(T.solution(N, s));

    }
}
