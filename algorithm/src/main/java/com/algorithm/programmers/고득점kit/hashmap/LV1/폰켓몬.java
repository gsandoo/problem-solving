package com.algorithm.programmers.고득점kit.hashmap.LV1;


import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int divide = nums.length / 2;

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int num : nums) hm.put(num, hm.getOrDefault(num,0)+1);

        if(hm.size() < divide) answer = hm.size();
        else{answer = divide;}

        return answer;
    }
}