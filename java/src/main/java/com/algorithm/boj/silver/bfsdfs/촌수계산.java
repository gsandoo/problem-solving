package com.algorithm.boj.silver.bfsdfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 촌수계산 {

    static boolean [] visited;
    static int n, m, count,start,end, answer;
    static List[] relation;

    public static void dfs(int l){
        if (visited[l] == true ) return;
        if (l == start){
            answer = count;
            return;
        }
        else{
            visited[l] = true;

            for (int i = 0 ; i < relation[l].size(); i++) {
                count ++;
                dfs((int)relation[l].get(i));
                count --;
            }
        }
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        start = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());

        m = Integer.parseInt(br.readLine());
        visited = new boolean[n+1];
        relation = new List[n+1];

        for (int i = 1 ; i < n+1 ; i++) {
            relation[i] = new ArrayList<>();
        }
        for (int i = 0 ; i < m ; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(stk.nextToken());
            int y = Integer.parseInt(stk.nextToken());
            relation[x].add(y);
            relation[y].add(x);
        }

        answer = -1;
        dfs(end);
        System.out.println(answer);

    }
}
