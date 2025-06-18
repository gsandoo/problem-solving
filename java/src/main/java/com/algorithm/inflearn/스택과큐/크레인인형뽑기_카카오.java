package com.algorithm.inflearn.스택과큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 크레인인형뽑기_카카오 {

    public int solution(int[][]board, int[]moves){
        int answer = 0;
        Stack<Integer> stack = new Stack<>(); // 결과를 담을 배열

        for (int i = 0 ; i < moves.length; i++){

            if (moves[i] > board[0].length) return 0;
            for (int j=0; j < board[0].length; j++){
                int doll = board[j][moves[i]-1];
                if (doll != 0) {
                    if (!stack.isEmpty() && stack.peek().equals(doll)) {
                        stack.pop();
                        answer += 2;
                    }else{
                        stack.push(doll);
                    }
                    board[j][moves[i]-1] = 0;
                    j =  board[0].length - 1;
                }
            }
        }
        return  answer;
    }

    public static void main(String[] args)throws IOException {

        크레인인형뽑기_카카오 t1 = new 크레인인형뽑기_카카오();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int [][] board = new int[N][N];

        for (int i = 0 ; i < N; i++){
            String[] m = new String[N];
            m =br.readLine().split(" ");
            for (int j = 0 ; j < m.length ; j++){
                board[i][j] = Integer.parseInt(m[j]);
            }
        }

        int M = Integer.parseInt(br.readLine());
        int [] moves = new int[M];

        String[] movesArr = br.readLine().split(" ");
        for (int j = 0 ; j < movesArr.length ; j++){
            moves[j] = Integer.parseInt(movesArr[j]);
        }

        System.out.println(t1.solution(board,moves));

    }

}
