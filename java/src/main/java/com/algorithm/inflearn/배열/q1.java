package com.algorithm.inflearn.배열;

import java.util.*;

// section2.1 큰수 출력
class q1 {
    public ArrayList<Integer> solution(int[] s, int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(s[0]);
        for (int i = 1 ; i < n ; i++){
            if (s[i] > s[i-1]){
                answer.add(s[i]);
            }
        }
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
        for (int x: T.solution(arr,n)
             ) {
            System.out.print(x + " ");
        }
    }
}