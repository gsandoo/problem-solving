package com.algorithm.boj.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class PointChicken {
    int x;
    int y;

    PointChicken(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class 치킨배달실패 {

    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {-1, 0, 1, 0};

    static int [][] visited, arr;
    static ArrayList<Integer>chicken;
    static int N,M,answer, checkX, checkY, dis;
    static Queue<PointChicken> q;

    static int [] ansArr;
    static StringTokenizer st;

    public static void bfs(PointChicken point){
        dis = Integer.MAX_VALUE;
        visited = new int[N][N];

        q= new LinkedList<>();
        q.offer(point);

        visited[point.x][point.y] = 1;

        checkX = point.x;
        checkY = point.y;

        while (!q.isEmpty()){
            PointChicken cp = q.poll();
            for (int i = 0; i < 4; i++ ){
                int nx = cp.x + dx[i];
                int ny = cp.y + dy[i];
                if (nx >= 0 && nx < N && ny >= 0 &&  ny < N && visited[nx][ny] == 0){
                    if (arr[nx][ny] == 2) {
                        int cdis = Math.abs(checkX -nx) + Math.abs(checkY+1 -ny+1);
                        dis = Math.min(dis,cdis);
                    }
                    PointChicken np = new PointChicken(nx, ny);
                    q.add(np);
                    visited[nx][ny] = 1;
                }
            }
        }
        chicken.add(dis);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N][N];
        ansArr = new int[M];
        chicken = new ArrayList<>();

        for (int i = 0 ; i < N ; i++){
            st = new StringTokenizer(br.readLine());
            for (int j = 0 ; j < N; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0 ; i < N; i ++){
            for (int j = 0 ; j < N; j++){
                if (arr[i][j]==1) {
                    bfs(new PointChicken(i, j));
                }
            }
        }

        for (int i = 0; i< chicken.size(); i++) answer += chicken.get(i);
        System.out.println(answer);
    }
}
