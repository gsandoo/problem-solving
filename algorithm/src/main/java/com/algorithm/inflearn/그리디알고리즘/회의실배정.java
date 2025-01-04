package com.algorithm.inflearn.그리디알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;


class Time implements Comparable<Time> {
    int start;
    int end;

    Time(int s, int e){
        this.start = s;
        this.end = e;
    }


    @Override
    public int compareTo(Time o) {
        if (this.end == o.end) return this.start - o.start;
        else return this.end - o.end;
    }
}
public class 회의실배정 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        ArrayList<Time> arr = new ArrayList<>();

        for (int i = 0 ; i < N ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            Time t = new Time(start,end);
            arr.add(t);
        }

        int cnt = 1;
        Collections.sort(arr);
        int nxt = arr.get(0).end;

        for (int i = 1 ; i < arr.size(); i++){
            int st = arr.get(i).start;
            if ( st >= nxt ){
                nxt = arr.get(i).end;
                cnt ++;
            }
        }

        System.out.println(cnt);
    }
}
