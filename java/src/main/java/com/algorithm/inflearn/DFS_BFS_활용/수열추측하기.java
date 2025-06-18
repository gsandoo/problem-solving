package com.algorithm.inflearn.DFS_BFS_활용;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 수열추측하기 {
    static int[] combiArr,visited, answer;
    static int n , r ;
    static boolean flag = false;

    public static int makeCombination(int n, int r){
        if (n == r || r == 0) return 1;
        else{
            return makeCombination(n-1,r-1) + makeCombination(n-1,r);
        }
    }

    public static void dfs(int level, int sum){
        if (flag) return ;
        if(level == n){
            if (sum == r){
                for (int x : answer) System.out.print(x+ " ");
                flag = true;
            }
        }else{
            for (int i = 1 ; i <= n ; i++) {
                if (visited[i] == 0) {
                    visited[i] = 1;
                    answer[level] = i;
                    dfs(level+1, sum + (combiArr[level] * answer[level]));
                    visited[i] = 0;
                }
            }
        }
    }



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());

        // 조합 값 만들기
        combiArr = new int[n];
        for (int i = 0 ; i < combiArr.length; i++) {
            combiArr[i] = makeCombination(n-1, i);
        }

        answer = new int[n];
        visited = new int [n+1];

        dfs(0,0);

    }
}
