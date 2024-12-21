package com.algorithm.inflearn.DFS_BFS_활용;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 최대점수구하기 {

    static int answer,sum, n, m ;
    static List[] list;
    static StringTokenizer st ;
    public static void dfs(int l, int sum, int times){
        //1. 시간을 넘겼을 때 ->
        if (times > m) return;
        //2. 시간을 넘기지 않았을 때 ->
        if (l == n) {
            answer = Math.max(answer, sum);
        }
        else{
            dfs(l+1, sum + (int)list[l].get(0), times + (int)list[l].get(1));
            dfs(l+1, sum, times );
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        list = new List[n+1];
        for (int i = 0 ; i < list.length ; i++){
            list[i] = new ArrayList<>();
        }

        for (int i = 0  ; i < n ; i++){
            st = new StringTokenizer(br.readLine());
            int point = Integer.parseInt(st.nextToken());
            int min = Integer.parseInt(st.nextToken());
            list[i].add(point);
            list[i].add(min);
        }

        dfs(0,0, 0);

        System.out.println(answer);
    }
}
