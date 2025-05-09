package com.algorithm.programmers.일반문제.퍼즐게임;


public class Solution {

    public int solution(int[] diffs, int[] times, long limit) {
        long l = 1;
        long r = limit;

        while(l < r){
            long mid = (l + r) >> 1;

            if(isImPossible(diffs, times, mid, limit)){
                l = mid + 1;
            }else{
                l = mid;
            }
        }

        return (int) l;
    }

    private static boolean isImPossible(int[] diffs, int[] times, long level, long limit){
        long tmp = (long) times[0];

        for(int i=1; i<diffs.length; i++){
            if(diffs[i] > level){
                tmp += (diffs[i] - level) * (times[i-1] + times[i]);
            }
            tmp += times[i];
        }
        return limit < tmp;
    }


}
