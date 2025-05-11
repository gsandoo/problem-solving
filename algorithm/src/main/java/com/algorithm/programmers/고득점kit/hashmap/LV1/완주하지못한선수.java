package com.algorithm.programmers.고득점kit.hashmap.LV1;

import java.util.*;


class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for(String p : participant){
            hm.put(p, hm.getOrDefault(p, 0)+1);
        }
        for (String c : completion){
            hm.put(c, hm.getOrDefault(c, 0)-1);
        }

        for (Map.Entry<String, Integer> map : hm.entrySet()) {
            if (map.getValue() != 0) answer = map.getKey();
        }
        return answer;
    }
}

