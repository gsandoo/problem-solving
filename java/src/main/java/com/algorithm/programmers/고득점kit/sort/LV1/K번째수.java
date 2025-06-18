package com.algorithm.programmers.고득점kit.sort.LV1;

import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int [commands.length];

        for (int i = 0 ; i < commands.length; i++){
            int [] narr = new int[(commands[i][1] - commands[i][0])+1];
            int idx = 0;
            for (int j = commands[i][0]-1 ; j <= commands[i][1]-1 ; j++ ){
                narr[idx] = array[j];
                idx ++ ;
            }
            Arrays.sort(narr);
            answer[i] = narr[commands[i][2]-1];
        }
        return answer;
    }

    public static void main(String[] args) {
        int[]array = {1, 5, 2, 6, 3, 7, 4};
        int[][]commands = {{2, 5, 3},{4, 4, 1},{1,7,3}};
        Solution s = new Solution();
        System.out.println(s.solution(array,commands));
    }
}
