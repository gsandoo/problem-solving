package com.algorithm.programmers.일반문제.멀쩡한사각형;

import java.math.BigInteger;

public class Solution {

    public long solution(int w, int h) {
        int gcd = BigInteger.valueOf(w).gcd(BigInteger.valueOf(h)).intValue();
        return ((long) w * (long) h) - ((((long) w / gcd) + ((long) h / gcd) - 1) * gcd);
    }
}
