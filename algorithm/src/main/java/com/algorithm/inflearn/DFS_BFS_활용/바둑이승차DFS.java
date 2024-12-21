package com.algorithm.inflearn.DFS_BFS_활용;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;

public class 바둑이승차DFS {

    static int answer, n, m;
    static int[] dogs;

    public static void dfs(int level , int sum, int[] dogs){
        // 1. 부분 집합 생성 x -> 값이 n 보다 큰 경우
        // 2. 부분 집합 생성 ->  값이 n 보다 작은 경우
        // 3. 부분 집합 생성 중 -> 값을 더한다 / 값을 더하지 않는다

        // 1번
        if (sum > n){return;}
        // 2번
        if (level == m){
            answer = Math.max(answer, sum);
        }
        // 3번
        else{
            dfs(level + 1, sum+ dogs[level], dogs);
            dfs(level + 1, sum, dogs);
        }
    }

    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        dogs = new int[m+1];

        for (int i = 0 ; i < m ; i++) {
            int x = Integer.parseInt(br.readLine());
            dogs[i] = x;
        }

        dfs(0,0,  dogs);
        System.out.println(answer);
    }
}
