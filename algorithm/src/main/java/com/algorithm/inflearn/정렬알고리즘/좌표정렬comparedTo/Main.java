package com.algorithm.inflearn.정렬알고리즘.좌표정렬comparedTo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Author    : Kang San Ah
 * Date      : 2024.09.17
 * Runtime   : 1 sec
 * Memory    : 256 MB
 * Algorithm : 선택 정렬 문제
 */

public class Main {

    public static int[] solution(int[] arr){

        //Arrays.sort(arr);
        // 13 5 11 7 23 15
        for (int i = 0 ; i < arr.length-1 ; i++){
            for (int j = i+1 ; j < arr.length; j++){
                if (arr[i] > arr[j]){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        String[] strArr = br.readLine().split(" ");
        for (int i = 0 ; i < arr.length; i++){
            arr[i] = Integer.parseInt(strArr[i]);
        }

        solution(arr);

        for (int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
