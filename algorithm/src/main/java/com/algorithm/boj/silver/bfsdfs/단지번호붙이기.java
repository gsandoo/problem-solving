package com.algorithm.boj.silver.bfsdfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class Points{
    int x;
    int y;

    Points(int x, int y){
        this.x = x;
        this.y = y;
    }
}


public class 단지번호붙이기 {

    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};

    static boolean[][] visited;
    static int [][] arr;
    static ArrayList<Integer> answer;
    static int N, count, houseCount;
    static StringTokenizer st;
    static Queue<Points> queue;


    public static void bfs(int x, int y){
        queue = new LinkedList<>();
        Points cp = new Points(x,y);
        queue.offer(cp);
        visited[x][y] = true;
        houseCount = 1;
        while (!queue.isEmpty()){
            Points p = queue.poll();
            arr[p.x][p.y] = 0;
            for (int i = 0 ; i < 4; i++){
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];
                if (nx >= 0 && nx < N && ny >= 0 && ny < N && visited[nx][ny]== false && arr[nx][ny] == 1){
                    visited[nx][ny]= true;
                    houseCount ++;
                    queue.offer(new Points(nx, ny));
                }
            }
        }
        answer.add(houseCount);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        arr = new int[N][N];
        visited = new boolean[N][N];
        answer = new ArrayList<>();

        for (int x = 0 ; x < N; x ++){
            String[] numbers = br.readLine().split("");
            for (int y = 0; y < N ; y++){
                arr[x][y] = Integer.parseInt(numbers[y]);
            }
        }

        count = 0;

        for (int x = 0 ; x < N; x ++){
            for (int y = 0; y < N; y++){
                if (arr[x][y] == 1){
                    count ++;
                    bfs(x,y);
                }
            }
        }

        System.out.println(count);
        Collections.sort(answer);
        for (int i = 0; i < answer.size(); i++){
            System.out.println(answer.get(i));
        }
    }
}
