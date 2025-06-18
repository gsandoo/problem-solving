package com.algorithm.ktb.여우는어떻게울지;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0 ; i < N ; i ++){
            st = new StringTokenizer(br.readLine());
            ArrayList<String> words = new ArrayList<>();

            while (st.hasMoreElements()) words.add(st.nextToken());


            ArrayList<String> sound = new ArrayList<>();
            while (true){
                String arr = br.readLine();
                if (arr.equals("what does the fox say?")) break;
                String[] w = arr.split(" ");
                sound.add(w[2]);
            }
            words.removeAll(sound);

            for (String x: words) System.out.print(x+ " ");
        }
    }
}
