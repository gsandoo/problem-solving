package com.algorithm.inflearn.section3.큰수출력하기;

import java.util.*;

// section3.1 두 배열 합치기
class q1 {
    public ArrayList<Integer> solution(int[] arr, int[] arr2, int n , int m) {
        ArrayList<Integer>answer = new ArrayList<>();
        int p1=0 , p2 = 0;
        while (p1 < n && p2 < m){
            if (arr[p1] < arr2[p2])answer.add(arr[p1++]);
            else answer.add(arr2[p2++]);
        }
        while (p1 < n ) answer.add(arr[p1++]);
        while (p2 < m ) answer.add(arr2[p2++]);
        return  answer;
    }

    public static void main(String[] args) {
        q1 T = new q1();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0 ; i < n ; i++){
            arr[i] = kb.nextInt();
        }
        int m = kb.nextInt();
        int[] arr2 = new int[m];
        for (int j = 0 ; j < m ; j++){
            arr2[j] = kb.nextInt();
        }
        for (int x: T.solution(arr, arr2, n, m)
        ) {
            System.out.print(x + " ");
        }
    }
}