package com.algorithm.boj.silver.bfsdfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 촌수계산정답 {
    static boolean[] visited;
    static int n, m, count, start, end, answer;
    static List<Integer>[] relation;

    public static void dfs(int l) {
        if (visited[l]) return; // 이미 방문한 노드라면 탐색 중단
        if (l == end) { // 목표 노드에 도착하면 촌수 기록
            answer = count;
            return;
        }

        visited[l] = true;
        for (int i = 0; i < relation[l].size(); i++) {
            int next = relation[l].get(i);
            if (!visited[next]) {
                count++;
                dfs(next);
                count--; // 백트래킹: 탐색 종료 후 촌수 원복
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        start = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());

        m = Integer.parseInt(br.readLine());
        visited = new boolean[n + 1];
        relation = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            relation[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(stk.nextToken());
            int y = Integer.parseInt(stk.nextToken());
            relation[x].add(y);
            relation[y].add(x);
        }

        answer = -1; // 촌수를 계산할 수 없는 경우를 대비
        count = 0;   // 촌수 카운트 초기화
        dfs(start);

        System.out.println(answer);
    }
}
