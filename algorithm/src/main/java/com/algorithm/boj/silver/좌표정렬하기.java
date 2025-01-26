package com.algorithm.boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Point implements Comparable<Point> {

    int x;
    int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if (o.x == this.x){
            return this.y-o.y;
        }else{
            return this.x - o.x;
        }
    }
}
public class 좌표정렬하기 {
    static StringTokenizer st;
    static Point[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        arr = new Point[N];
        for (int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            Point point = new Point(x,y);
            arr[i] = point;
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i].x + " " + arr[i].y);
        }
    }
}
