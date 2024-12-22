package com.algorithm.inflearn.DFS_BFS_활용;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// input : 3 2
// output: 1 1
//         1 2
//         1 3
// ...
public class 중복순열 {

    static int N, M;
    static int[] pm;

    public  static void dfs(int level){

        if (level == M){
            for (int x : pm) System.out.print(x + " ");
            System.out.println();
        }else{
            for (int i = 1; i <= N; i++) {
                pm[level] = i;
                dfs(level+1);
            }
        }
    }


    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        pm = new int[M];

        dfs(0);
    }

}
