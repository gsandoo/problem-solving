package com.algorithm.boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import java.util.StringTokenizer;

public class 종이의개수 {

    static ArrayList<ArrayList<ArrayList<Integer>>> arr;
    static int N, zero,one,two;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        arr = new ArrayList<>();

        for (int i = 0 ; i < 3; i++){
            arr.add(new ArrayList<>());
            for (int j = 0 ; j < 2 ; j++){
                arr.get(i).add(new ArrayList<>());
            }
        }
    }
}
