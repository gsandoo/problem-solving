package com.algorithm.solvedac.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class 부녀회장이될테야 {

    static int[][] apartment;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        apartment = new int[15][15];
        for (int i = 1; i < 15; i++) {
            apartment[i][1] = 1 ;
            apartment[0][i] = i ; // 기본 값 초기화
        }

        for (int i = 1; i <= 14 ; i++ ){
            for (int j = 1; j <= 14; j++){
                apartment[i][j] = apartment[i][j-1] + apartment[i-1][j];
            }
        }

        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            System.out.println(apartment[k][n]);
        }

    }
}
