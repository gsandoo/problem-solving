package com.algorithm.inflearn.section4.최대매출;

import java.util.HashMap;

public class q3 {
    public String solution(String arr , String arr2) {
        String answer = "YES";
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char x : arr.toCharArray()){
            hashMap.put(x, hashMap.getOrDefault(x,0)+1);
        }
        for (char x: arr2.toCharArray()
        ) {
            // 알파벳이 해시맵에 key로 없거나 get시 0보다 작을때
            if (!hashMap.containsKey(x)|| hashMap.get(x) < 0){
                return "NO";
            }
        }
        return  answer;
    }

    public static void main(String[] args) {
        q3 T = new q3();
        String arr = "abaCC";
        String arr2 = "baeeACA";
        System.out.println(T.solution(arr, arr2));
    }
}
