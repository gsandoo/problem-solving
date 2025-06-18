package com.algorithm.study;

import java.util.Scanner;

public class Paper {

    public int solution(int m , int[]ar){
        int answer = 0 , p1 = 0 , p2= 1;
        int[][] r  = new int[100][100]; // 100*100 배열

        for (int i = 0 ; i < m ; i++){
            int a = ar[p1], b = ar[p2]; // 3, 7
            for (int j = b ; j < b+10 ; j++){
                for (int k = a ; k < a+10 ; k++){
                    r[j][k] =1;
                }
            }
            p1+=2 ;
            p2+=2 ;
        }

        for (int i = 0 ; i < 100 ; i++ ){
            for (int j = 0 ; j < 100 ; j++){
                if (r[i][j]==1){
                    answer ++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Paper T = new Paper();
        Scanner kb = new Scanner(System.in);
        int m = kb.nextInt(); //3
        int[] ar = new int[m*2];
        for (int i = 0 ; i < ar.length ; i++){
            ar[i] = kb.nextInt();
        }
        System.out.println(T.solution(m,ar));
    }
}
