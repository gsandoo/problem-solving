package com.algorithm.inflearn.스택과큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 공주구하기 {

    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> q = new LinkedList<>();

        for(int i = 1 ; i <= n ; i++ ){
            q.offer(i);
        }

        int answer = 0;

        while (q.size() > 1){
               for (int i = 1 ; i < k ; i++){
                   int a = q.poll();
                   q.offer(a);
               }
               q.poll();
        }

        answer = q.poll();
        System.out.println(answer);
    }

}
