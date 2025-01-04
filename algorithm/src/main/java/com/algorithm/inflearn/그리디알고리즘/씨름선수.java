package com.algorithm.inflearn.그리디알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Body implements Comparable<Body>{
    int h;
    int w;

    Body(int w, int h){
        this.w = w;
        this.h = h;
    }

    @Override
    public int compareTo(Body o) {
        return o.h - this.h;
    }
}

public class 씨름선수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        List<Body> arr =new ArrayList<>();

        for (int i = 0 ; i < N ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A  = Integer.parseInt(st.nextToken());
            int B  = Integer.parseInt(st.nextToken());
            Body body = new Body(A,B);
            arr.add(body);
        }

        int count = 0;

        Collections.sort(arr);

        int max = Integer.MIN_VALUE;
        for (Body x : arr){
            if (x.w > max){
                max = x.w;
                count++;
            }
        }

        System.out.println(count);

    }
}
