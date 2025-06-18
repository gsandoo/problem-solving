package com.algorithm.solvedac.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 바이러스 {

    static int count, n, m, x, y;
    static List[] computers;
    static boolean [] visited;
    public static void dfs(int l){
        if (visited[l] == true) return;
        else{
            visited[l] = true;
            count ++;
            for (int i = 0 ; i < computers[l].size() ; i++){
                dfs((int)computers[l].get(i));
            }
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        visited = new boolean[n+1];
        computers = new List[n+1];

        for (int i = 0 ; i < computers.length; i++){
            computers[i] = new ArrayList<>();
        }

        for (int i = 0 ; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            computers[x].add(y);
            computers[y].add(x);
        }

        dfs(1);
        System.out.println(count-1);
    }
}

