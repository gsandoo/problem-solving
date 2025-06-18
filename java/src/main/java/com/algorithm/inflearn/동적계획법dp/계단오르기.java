package com.algorithm.inflearn.동적계획법dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 계단오르기 {

    static  int [] dy;

    public static int answer (int n){

        dy[0] = 1;
        dy[1] = 2;
        for (int i = 2; i < n ; i++){
            dy[i] = dy[i-2]+ dy[i-1];
        }
        return dy[n-1];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N= Integer.parseInt(br.readLine());
        dy = new int[N +1];
        System.out.println(answer(N));
    }
}
