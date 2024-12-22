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
