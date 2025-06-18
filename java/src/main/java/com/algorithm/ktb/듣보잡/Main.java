package com.algorithm.ktb.듣보잡;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<String, Integer> hm = new HashMap<>();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        for (int i = 0 ; i <  N ; i++) hm.put(br.readLine(), 1);

        ArrayList<String> a = new ArrayList<>();
        for (int i = 0 ; i < M ; i++){
            String word = br.readLine();
            hm.put(word, hm.getOrDefault(word , 0) + 1);
            if (hm.get(word) == 2) a.add(word);
        }

        System.out.println(a.size());
        Collections.sort(a);
        for (String x : a) System.out.println(x);

    }
}
