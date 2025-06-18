package com.algorithm.boj.gold.iv_1753;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class Edge implements Comparable<Edge>{
    public int vex; // 노드 번호
    public int cost; // 비용

    public Edge(int vex, int cost){
        this.vex = vex;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge o) {
        return this.cost - o.cost;
    }
}

public class Main {
    private static int[] dis;
    static ArrayList<ArrayList<Edge>> graph;
    static int V,E,K;

    public void solution(int v){
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        pq.offer(new Edge(v, 0));
        dis[v] = 0;

        while (!pq.isEmpty()){
            Edge tmp = pq.poll();
            int now = tmp.vex;
            int nowCost = tmp.cost;
            if (nowCost > dis[now]) continue;
            // 중요. "노드 비용 > 노드 까지 발생 비용" 이면 굳이 for문을 돌 필요 없다!
            for (Edge ob : graph.get(now)){
                if (dis[ob.vex] > nowCost+ob.cost){
                    dis[ob.vex] = nowCost + ob.cost;
                    pq.offer(new Edge(ob.vex , nowCost + ob.cost));
                }
            }
        }
    }

    public static void main(String[] args){

        Main main= new Main();

        graph = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        V = scanner.nextInt(); // 5
        E = scanner.nextInt(); // 6
        K = scanner.nextInt(); // 1

        for (int i = 0 ; i <= V ; i++){
            graph.add(new ArrayList<Edge>());
        }

        dis = new int[V+1];
        Arrays.fill(dis,Integer.MAX_VALUE);

        for (int i = 0 ; i < E ; i++){
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int w = scanner.nextInt();

            graph.get(u).add(new Edge(v,w));
        }

        main.solution(K);
        for (int i = 1 ; i <= V ; i ++){
            if (dis[i]!= Integer.MAX_VALUE) System.out.println(dis[i]);
            else System.out.println("INF");
        }
    };
}

