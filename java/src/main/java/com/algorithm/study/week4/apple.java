package com.algorithm.study.week4;

import java.util.*;

// 과일 장수
public class apple {
    public int solution(int k, int m, int[] score) {
        int answer = 0 ;
        Arrays.sort(score);
        int i = score.length-m;
        while (i>=0){
            answer += score[i] * m ;
            i = i-m;
        }
        return answer;
    }

    public static void main(String[] args) {
        apple T = new apple();
        Scanner kb = new Scanner(System.in);
        int k = kb.nextInt(); //3 , 가장 높은 점수
        int m = kb.nextInt(); //4 , 사과 담는 개수
        int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};

        System.out.println(T.solution(k , m , score));
    }
}
