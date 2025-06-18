package com.algorithm.inflearn.정렬알고리즘.선택정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


/**
 * Author    : Kang San Ah
 * Date      : 2024.09.16(Mon)
 * Runtime   : 1 sec
 * Memory    : 256 MB
 * Algorithm : 정렬 문제(Compared To 활용 문제)
 */

public class Main {

    static class Point implements Comparable<Point>{

        int x;
        int y;

        Point(int x, int y){
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {
            if (this.x == o.x)return this.y-o.y;
            else return this.x-o.x;
        }


    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        ArrayList<Point> arr = new ArrayList<>();

        for (int i = 0 ; i < N ; i ++){

            String[] ip = br.readLine().split(" ");
            int x = Integer.parseInt(ip[0]);
            int y = Integer.parseInt(ip[1]);
            arr.add(new Point(x,y));
        }
        Collections.sort(arr);

        for(int i = 0 ; i < arr.size(); i++){
            System.out.println(arr.get(i).x + " " + arr.get(i).y);
        }
    }
}
