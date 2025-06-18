package com.algorithm.ssafy.D3;

import java.util.*;

class Solution {

    public static long maxOper(long A0, long B0) {
        if (A0 == B0) {
            return 0; // 이미 같은경우
        }else if(A0 > B0) {
            return -1; // A는 더하기 연산만 가능하므로..
            // 이걸 까먹어서 1시간을 헤맸네
        }

        long diff = Math.abs(A0 - B0); // 절대값 , 예) 5,10 = 5

        if (diff == 1) {
            return -1; // 차이가 1인경우 불가능.
        } else if(diff % 2 == 1){
            return (long)((diff - 1) / 2) ;
        } else {
            return (long)(diff/2);
        }
    }

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long answer = maxOper(a, b);

            System.out.printf("#%d %d\n", i + 1, answer);
        }

        sc.close();
    }
}