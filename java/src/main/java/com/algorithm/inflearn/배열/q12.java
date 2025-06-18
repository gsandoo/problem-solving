package com.algorithm.inflearn.배열;

import java.util.Scanner;

// 멘토링
public class q12 {

    public int solution(int m , int n , int[][]s) {
        int answer = 0 ;

        for (int i = 1 ; i <= n ; i ++){ // 숫자가 1,2,3,4 이니
            for (int j = 1 ; j <= n ; j ++ ){ // j도 마찬가지 -> j번 학생
                int cnt = 0 ;
                for (int k = 0 ; k < m ; k++){ // k와 l 이 실제로 반복하며 돌 배열
                    int pi = 0 , pj=0 ;
                    for (int l = 0 ; l < n ; l++){
                        if (s[k][l] == i ) pi = l; // 1번 학생부터 체크하는거, 이경우에 걸리는게 1번
                        if (s[k][l] == j) pj = l;
                    }
                    if (pi < pj ) cnt ++;
                }
                if (cnt==m) answer++;
            }
        }
        return  answer;
    }

    public static void main(String[] args) {
        q12 T = new q12();
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int M = kb.nextInt();
        int[][] s = new int[M][N];
        for (int i = 0 ; i < M ; i++){
            for (int j = 0 ; j < N ; j++){
                s[i][j] = kb.nextInt();
            }
        }
        System.out.println(T.solution(M,N,s));
    }
}
