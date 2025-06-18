package com.algorithm.inflearn.배열;
import java.util.*;

public class q2 {
        public int solution(int[] s, int n) {
            int answer = 1 , max = s[0] ;
            for (int i = 1 ; i < n ; i++){
               if (s[i] > max){
                   max = s[i];
                   answer ++;
               }
            }
            return  answer;
        }

        public static void main(String[] args) {
            q2 T = new q2();
            Scanner kb = new Scanner(System.in);
            int N = kb.nextInt();
            int[] arr = new int[N];
            for (int i = 0 ; i < N ; i++){
                arr[i] = kb.nextInt();
            }
            System.out.println(T.solution( arr,N ));
        }
}
