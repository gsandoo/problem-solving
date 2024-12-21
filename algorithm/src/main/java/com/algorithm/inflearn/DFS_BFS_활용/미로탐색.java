package com.algorithm.inflearn.DFS_BFS_활용;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 미로탐색 {

    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static int [][] board;
    static int answer;

    public void bfs (int x, int y){
        if (x == 7 && y == 7) answer ++;
        else{
            for (int i = 0 ; i < 4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                if ( nx >=1 && nx <= 7 && ny >= 1 && ny <= 7 && board[nx][ny] == 0) {
                    board[nx][ny] = 1;
                    bfs(nx,ny);
                    board[nx][ny] = 0;
                }
            }
        }
    }


    public static void main(String[] args)throws IOException {
        미로탐색 t1 = new 미로탐색();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        board = new int[8][8];
        for (int i = 1 ; i <= 7 ; i++){
            String[] line =  br.readLine().split(" ");
            for (int j = 1 ; j <=7 ; j++){
                board[i][j] = Integer.parseInt(line[j-1]);
            }
        }
        board[1][1] = 1;
        t1.bfs(1, 1);
        System.out.println(answer);
    }

}
