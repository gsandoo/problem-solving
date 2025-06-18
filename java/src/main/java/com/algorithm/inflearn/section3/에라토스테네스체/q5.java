package com.algorithm.inflearn.section3.에라토스테네스체;

import java.util.*;

// section3.5 연속된 자연수의 합
class q5 {
    public int solution(int n ) {
        int answer=0 , sum =0  ,lt= 0 ;
        int[] arr = new int[n];
        for (int i = 0 ; i < n ; i++){
            arr[i] = i+1;
        }
        for (int rt = 0 ; rt < n ; rt++){
            sum+=arr[rt];
            if (sum == n)answer++;
            while (sum > n){
                sum-= arr[lt++];
                if (arr[rt]==n) break;
                if (sum==n) answer++;
            }
        }
        return  answer;
    }

    public static void main(String[] args) {
        q5 T = new q5();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.solution(n ));
    }
}