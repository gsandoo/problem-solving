package com.algorithm.boj.solvedac.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N과M4 {

    static int N, M;
    static int [] made;
    public static void dfs(int L, int at){
        if (L == M){
            for (int m : made) System.out.print(m + " ");
            System.out.println();
        }else{
            for (int i = at ; i <= N; i++){
                made[L] = i;
                dfs(L+1, i);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        made = new int[M];

        dfs(0, 1);

    }
}
