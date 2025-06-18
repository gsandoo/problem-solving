package com.algorithm.inflearn.동적계획법dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class 돌다리건너기 {

    static int[]dy;

    public static int solution(int n){
        int answer = 0;
        dy[1] = 1;
        dy[2] = 2;
        for (int i = 3 ; i <= n+1 ; i++){
            dy[i] = dy[i-1] + dy[i-2] ;
        }
        answer = dy[n+1];
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        dy = new int[N+2];

        System.out.println(solution(N));
    }
}
