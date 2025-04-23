package com.algorithm.ktb.수들의합;

import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int [] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i <  arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int L = 0;
        int R = 0;
        int count = 0 ;

        if(arr.length > 1) {
            R = 1;
        }else{
            if(arr[L] == M){
                count ++;
            }
        }

        while(L != arr.length-1){
            int sum = arr[L] + arr[R];
            if(sum == M && (L!=R)){
                count ++;
                L ++;
            }else{
                if(R != arr.length-1)R++;
            }
        }

        System.out.println(count);
    }
}
