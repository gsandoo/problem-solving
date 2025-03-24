package com.algorithm.ktb.나는야포켓몬마스터이다솜;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<Integer,String> hm = new HashMap<>();

        for (int i = 1 ; i <= N; i++) hm.put(i,br.readLine());

        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0 ; i < M; i ++) {
            String input = br.readLine();
            // 숫자라면
            if (input.toCharArray()[0] < 'A' || input.toCharArray()[input.toCharArray().length-1] < 'A'){
                arr.add(hm.get(Integer.parseInt(input)));
            }else {
                for (HashMap.Entry<Integer, String> entry : hm.entrySet()) {
                    if (entry.getValue().equals(input)) {
                        arr.add(String.valueOf(entry.getKey()));
                    }
                }
            }
        }
        for (String x : arr) System.out.println(x);
    }
}
