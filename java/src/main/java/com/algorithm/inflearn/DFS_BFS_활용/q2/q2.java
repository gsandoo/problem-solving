package com.algorithm.inflearn.DFS_BFS_활용.q2;

import java.util.Scanner;

public class q2 {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int T = sc.nextInt();

        int[] result = new int[T+1];

        result[0] = 1;
        result[1] = 2;

        for (int i = 2 ; i <= T ; i++)
        {
            result[i] = result[i-1] + result[i-2];
        }

        System.out.println(result[T]);
    }
}
