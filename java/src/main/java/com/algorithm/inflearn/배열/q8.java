package com.algorithm.inflearn.배열;

import java.util.Scanner;

public class q8 {

    public int[] solution(int N , int[] s) {
        int[] answer = new int[N];
        int count = 1 ;
        for (int i = 0 ; i < N ; i ++) {
            for (int j = 0; j < N; j++) {
                if (s[i] < s[j]) {
                    count ++;
                }
            }
            answer[i] = count;
            count = 1;
        }
        return  answer;
    }

    public static void main(String[] args) {
        q8 T = new q8();
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int[] s = new int[N];
        for (int i = 0 ; i < N ; i++){
            s[i] = kb.nextInt();
        }
        for (int x: T.solution(N, s)
             ) {
            System.out.print(x + " ");
        }
    }
}
