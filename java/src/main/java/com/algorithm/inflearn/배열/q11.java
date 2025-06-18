package com.algorithm.inflearn.배열;

import java.util.Scanner;

// 봉우리
public class q11 {

    public int solution(int N , int[][]s) {
        int answer = 0 , max = Integer.MIN_VALUE;
        for (int i = 1 ; i <=N; i++ ){
            int count = 0;
            for (int j = 1 ; j <=N ; j++){
                for (int k = 1; k <=5 ; k++){
                    if (s[i][k] == s[j][k]){
                        count++;
                        break;
                    }
                }
            }
            if (count > max) {
                answer = i;
                max = count;
            }
        }
        return  answer;
    }

    public static void main(String[] args) {
        q11 T = new q11();
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int[][] s = new int[N+1][6];
        for (int i = 1 ; i <= N ; i++){
            for (int j = 1 ; j <= 5 ; j++){
                s[i][j] = kb.nextInt();
            }
        }
        System.out.println(T.solution(N, s));
    }
}
