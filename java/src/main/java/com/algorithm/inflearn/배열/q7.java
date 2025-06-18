package com.algorithm.inflearn.배열;

import java.util.Scanner;

//점수계산
public class q7 {

    public int solution(int N , int[] s) {
        int answer = 0 , tmp = 0;
        for (int i = 0 ; i < N ; i ++){
            if (s[i] == 1){
                tmp++;
                answer += tmp;
                }else{
                    tmp = 0;
                }
            }
        return  answer;
    }

    public static void main(String[] args) {
        q7 T = new q7();
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int[] s = new int[N];
        for (int i = 0 ; i < N ; i++){
            s[i] = kb.nextInt();
        }
        System.out.println(T.solution(N, s));
    }
}
