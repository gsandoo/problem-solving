package com.algorithm.boj.silver.stack;

import java.io.*;
import java.util.*;

public class 오큰수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0 ; i  < n ; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(0); // 첫번째 인덱스 삽입
        int idx = 1 ;

        while (idx < n) {
            if (arr[stack.peek()] > arr[idx]){
                stack.push(idx);
                idx ++;
            }else{
                while (!stack.isEmpty()){
                    if (arr[stack.peek()] < arr[idx]){
                        arr[stack.peek()] = arr[idx];
                        stack.pop();
                    }
                    else break;
                }
                stack.push(idx);
                idx ++;
            }
        }

        while (!stack.isEmpty()){
            arr[stack.peek()] = -1;
            stack.pop();
        }

        for (int x : arr) System.out.print(x + " ");
    }
}
