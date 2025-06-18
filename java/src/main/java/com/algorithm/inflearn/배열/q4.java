package com.algorithm.inflearn.배열;
import java.util.*;

// 피보나치 수열
public class q4 {
    public int[] solution(int N) {
        int[] answer = new int[N];
        answer[0] = 1;
        answer[1] = 1;
        for (int i = 2 ;  i < N ; i ++){
            answer[i] = answer[i-2]+ answer[i-1];
        }
        return  answer;
    }

    public static void main(String[] args) {
        q4 T = new q4();
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        for (int x:T.solution(N)
        ) {
            System.out.print(x + " ");
        }
    }
}
