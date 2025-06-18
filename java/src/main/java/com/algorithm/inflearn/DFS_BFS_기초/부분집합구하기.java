package com.algorithm.inflearn.DFS_BFS_기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 부분집합구하기 {
    static int n;
    static int [] arr;
    public static void dfs (int L){
        if (L == n+1){
            for (int i = 1 ; i < arr.length; i++){
                if (arr[i] == 1) System.out.print(i + " ");
            }
            System.out.println();
        }else {
            arr[L] = 1;
            dfs(L+1);
            arr[L] = 0;
            dfs(L+1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         n = Integer.parseInt(br.readLine());
        arr = new int[n+1]; // 0은 안쓸 것이기 때문
        dfs(1);
    }
}
