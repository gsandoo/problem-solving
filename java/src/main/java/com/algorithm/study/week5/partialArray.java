package com.algorithm.study.week5;

import java.util.ArrayList;

public class partialArray {
    public int solution(String t, String p) {
        int answer = 0;
        ArrayList<Long> arr = new ArrayList<>();
        long plen = p.length();

        for (int i = 0 ; i < t.length()-plen+1 ; i++){
            String s = t.substring(i, (int) (i+plen));
            arr.add(Long.parseLong(s));
        }
        for (int j = 0 ; j < arr.size();j++){
            if (arr.get(j) <= Long.parseLong(p))answer++;
        }
        return answer;
    }


    public static void main(String[] args) {
        partialArray T = new partialArray();
        String t = "500220839878";
        String p = "7";
        System.out.println(T.solution(t, p));
    }
}
