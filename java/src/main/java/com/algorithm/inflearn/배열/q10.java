package com.algorithm.inflearn.배열;

import java.util.Scanner;

// 봉우리
public class q10 {
    int[] dy = {-1,0,1,0};
    int[] dx = {0,1,0,-1};
    public int solution(int N , int[][]s) {
        int answer = 0;
        for (int i = 0 ; i < N ; i++){
            for (int j = 0 ; j < N ; j++){
                boolean flag  = true;
                for (int k = 0 ; k < 4 ; k++){
                    int ny = i + dy[k];
                    int nx = j + dx[k];
                    if (ny>=0 && ny < N && nx < N && nx>= 0 && s[ny][nx] >= s[i][j]){
                        flag = false;
                        break;
                    }
                }if (flag) answer++;
            }
        }
        return  answer;
    }

    public static void main(String[] args) {
        q10 T = new q10();
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int[][] s = new int[N][N];
        for (int i = 0 ; i < N ; i++){
            for (int j = 0 ; j < N ; j++){
                s[i][j] = kb.nextInt();
            }
        }
        System.out.println(T.solution(N, s));
    }
}
