package com.algorithm.inflearn.DFS_BFS_기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 재귀함수 {

    public static void dfs (int N) {
        if (N == 0 ) return;
        else {
            dfs(N - 1);
            System.out.print(N+ " ");
        }
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        dfs(N);
    }

}
