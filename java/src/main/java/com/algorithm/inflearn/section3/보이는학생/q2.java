package com.algorithm.inflearn.section3.보이는학생;

import java.util.*;

// section3.2 공통원소 구하기
class q2 {
    public ArrayList<Integer> solution(int[] arr, int[] arr2, int n , int m) {
        ArrayList<Integer>answer = new ArrayList<>();
        int p1= 0 , p2 = 0;
        while (p1 < n && p2 < m){
            if (arr[p1] < arr2[p2]){
                p1++;
            }else if (arr[p1] > arr2[p2]) p2++;
            else {
                answer.add(arr[p1]);
                p1++;
                p2++;
            }
        }
        return  answer;
    }

    public static void main(String[] args) {
        q2 T = new q2();
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