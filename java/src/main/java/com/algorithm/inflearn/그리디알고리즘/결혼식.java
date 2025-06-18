package com.algorithm.inflearn.그리디알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Marry implements Comparable<Marry>{
    int come;
    char type;
    Marry(int c, char t){this.come = c; this.type = t;}

    @Override
    public int compareTo(Marry o) {
        if (o.come == this.come) return this.type - o.type;
        else return this.come - o.come;
    }
}
public class 결혼식 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        ArrayList<Marry> arr = new ArrayList<>();

        for (int i = 0 ; i < N ; i ++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int come = Integer.parseInt(st.nextToken());
            int leave = Integer.parseInt(st.nextToken());
            arr.add(new Marry(come, 's' ));
            arr.add(new Marry(leave, 'e'));
        }

        Collections.sort(arr);
        int answer = Integer.MIN_VALUE;
        int count = 0;

        for (Marry m : arr){
            if (m.type == 's'){
                count++;
                answer = Math.max(answer,count);
            }else{
                count--;
                answer = Math.max(answer,count);
            }
        }

        System.out.println(answer);
    }
}
