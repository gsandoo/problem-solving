package com.algorithm.ktb.체스판다시칠하기;

import java.io.*;
import java.util.*;

public class Main {
    static boolean[][] arr ;
    static StringTokenizer st;
    static int N,M, min = 64;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new boolean[N][M];

        for (int i = 0 ; i < N;  i ++){
            String str = br.readLine();
            for (int j = 0 ; j < M; j ++){
                if (str.charAt(j) == 'W')arr[i][j] = true;
                else arr[i][j] = false;
            }
        }

        // 8x8의 경우의 수는 1, 즉 모든 경우를 돌 필요 없고 (N-7) x (M-7)의 경우의 수만 체크하면 된다.
        int c_col = N-7;
        int c_row = M-7;

        for (int i = 0 ; i < c_col ; i ++) {
            for (int j = 0 ; j < c_row ; j++) {
                find(i,j);
            }
        }
        System.out.println(min);
    }

    static void find (int x, int y){
        int range_x = x + 8;
        int range_y = y + 8;

        boolean wb = arr[x][y];
        int count = 0 ;
        for (int i = x ; i < range_x; i++){
            for (int j = y ; j < range_y; j++){
                if (arr[i][j] != wb){
                    count++;
                }
                wb = (!wb);
            }
            wb = !wb;
        }

        count = Math.min(count, 64-count);
        min = Math.min(min , count);
    }
}
