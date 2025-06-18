package com.algorithm.ktb.색종이만들기;

import java.io.*;

public class Main {
    static int[][] arr;
    static int white = 0, blue = 0;

    public static void divideAndConquer(int x, int y, int size) {
        if (checkColor(x, y, size)) {
            if (arr[x][y] == 0) white++;
            else blue++;
            return;
        }

        int newSize = size / 2;
        divideAndConquer(x, y, newSize);
        divideAndConquer(x, y + newSize, newSize);
        divideAndConquer(x + newSize, y, newSize);
        divideAndConquer(x + newSize, y + newSize, newSize);
    }

    public static boolean checkColor(int x, int y, int size) {
        int color = arr[x][y];
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (arr[i][j] != color) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        arr = new int[N][N];

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(input[j]);
            }
        }

        divideAndConquer(0, 0, N);

        System.out.println(white);
        System.out.println(blue);
    }
}

