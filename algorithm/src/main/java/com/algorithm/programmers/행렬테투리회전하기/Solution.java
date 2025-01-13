package com.algorithm.programmers.행렬테투리회전하기;


import java.util.ArrayList;
import java.util.Collections;

public class Solution {

    static int[][] matrix ;
    static int cL;

    static int [][] queries = {{2,2,5,4},{3,3,6,6},{5,1,6,3}};

    public static int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];

        matrix = new int[rows][columns];

        //행렬 초기화
        for (int i = 0 ; i < rows; i++){
            for (int j = 0 ; j < columns; j++){
                matrix[i][j] = i*columns + j + 1;
            }
        }

        for (int i = 0 ; i < queries.length; i++){
            answer[i] = rotate(queries[i]);
        }

        return answer;
    }

    public static int rotate(int[]query){

        ArrayList<Integer> arrayList = new ArrayList<>();

        cL = matrix[query[0]-1][query[1]-1];

        for (int i = 1 ; i <= query[3]-query[1] ; i++){
            int tmp = matrix[query[0]-1][query[1]+i-1];
            arrayList.add(tmp);
            matrix[query[0]-1][query[1]+i-1] = cL;
            cL = tmp;
        }


        for (int i = 1 ; i <= query[2]-query[0]; i++){
            int tmp = matrix[query[0]-1+i][query[3]-1]; // 5 2
            arrayList.add(tmp);
            matrix[query[0]-1+i][query[3]-1] = cL;
            cL = tmp;
        }

        for (int i = query[3]-1; i > query[1]-1; i--){
            int tmp = matrix[query[2]-1][i-1];
            arrayList.add(tmp);
            matrix[query[2]-1][i-1] = cL;
            cL = tmp;
        }

        for (int i = query[2]-1; i > query[0]-1; i--){
            int tmp = matrix[i-1][query[1]-1];
            arrayList.add(tmp);
            matrix[i-1][query[1]-1] = cL;
            cL = tmp;
        }

        Collections.sort(arrayList);
        return  arrayList.get(0);
    }

    public static void main(String[] args) {

        solution(6,6,queries);
    }
}
