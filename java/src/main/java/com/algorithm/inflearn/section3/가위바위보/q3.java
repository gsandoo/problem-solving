package com.algorithm.inflearn.section3.가위바위보;

import java.util.*;

// section3.3 최대매출 구하기 -> sliding window O(n2)->O(n)
class q3 {
    public int solution(int n , int m , int[] arr) {
        int answer , sum = 0;
        for (int i = 0 ; i < m ; i++){
            sum += arr[i];
        }
        answer = sum;

        for (int i = m ; i < n ; i++){
            sum +=(arr[i]-arr[i-m]);
            if (answer < sum) answer = sum;
        }



        return  answer;
    }

    public static void main(String[] args) {
        q3 T = new q3();
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