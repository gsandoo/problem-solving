package com.algorithm.inflearn.section3.피보나치;

import java.util.*;

// section3.4 연속 부분 수열
class q4 {
    public int solution(int n , int m , int[] arr) {
        int answer=0 , sum = 0 , lt = 0;
        for (int rt = 0 ; rt < n ; rt++){
            sum += arr[rt++];  //arr[0]
            if (sum == m) answer++;
            while (sum>=m){
                sum-= arr[lt++];
                if (sum == m) answer++;
            }
        }
        return  answer;
    }

    public static void main(String[] args) {
        q4 T = new q4();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0 ; i < n ; i++){
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n , m , arr));
    }
}