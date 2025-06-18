package com.algorithm.inflearn.DFS_BFS_활용;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 바둑이승차DFS {

    static int answer = Integer.MIN_VALUE, n, m;
    static int[] dogs;

    public static void dfs(int level, int sum, int[] dogs){

        // sum이 259를 넘으면
        if (sum > n) return;
        // 말단 노드까지 더했으면
        if (level == m){
            answer =  Math.max(answer, sum);
        }
        // dfs 계속 도는 경우
        else{
            dfs(level+1, sum + dogs[level], dogs); // 다음 값을 더한다
            dfs(level+1, sum, dogs); // 다음 값을 더하지 않는다
        }
    }

    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        dogs = new int[m];

        for (int i = 0 ; i < dogs.length ; i++){
            dogs[i] = Integer.parseInt(br.readLine());
        }

        dfs(0,0, dogs);
        System.out.println(answer);
    }
}
