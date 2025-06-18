package com.algorithm.inflearn.배열;
import java.util.*;

// 에라토스테네스 체 -> 소수
public class q5 {
    public int solution(int N) {
        int answer = 0;
        int[] c = new int[N + 1];
        for (int i = 2 ; i <=  N ; i++){
            if (c[i] ==0){
                answer ++;
                for (int j = i ; j <=N  ; j= j + i){
                    c[j] = 1;
                }
            }
        }
        return  answer;
    }

    public static void main(String[] args) {
        q5 T = new q5();
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        System.out.println(T.solution(N));
    }
}
