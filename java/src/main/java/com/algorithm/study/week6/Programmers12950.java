package com.algorithm.study.week6;

//   arr 1              arr 2           return
// [[1,2],[2,3]]	[[3,4],[5,6]]	[[4,6],[7,9]]
//  [[1],[2]]	      [[3],[4]]	        [[4],[6]]
public class Programmers12950 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        for (int i = 0 ; i < arr1.length  ; i++){
            for (int j = 0 ; j < arr1[0].length ; j ++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Programmers12950 t = new Programmers12950();
        int [][] arr1 = {{1},{2}};
        int [][] arr2 = {{3},{5}};
        System.out.println(t.solution(arr1,arr2));
    }
}
