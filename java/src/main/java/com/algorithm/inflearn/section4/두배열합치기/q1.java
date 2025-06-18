package com.algorithm.inflearn.section4.두배열합치기;
import java.util.HashMap;

// 해시
public class q1 {
    public Character solution(int n , String arr) {
        char answer = 0;
        HashMap<Character , Integer> hashMap = new HashMap<>();
        for (char x: arr.toCharArray()
             ) {
            hashMap.put(x , hashMap.getOrDefault(x , 0)+1);
        }
        int val = Integer.MIN_VALUE;
        for (char key: hashMap.keySet() // 키들의 집합
             ) {
            if (hashMap.get(key) > val) {
                val = hashMap.get(key);
                answer = key;
            }
        }
        return  answer;
    }

    public static void main(String[] args) {
        q1 T = new q1();
        int n = 15;
        String arr = "BACBACCACCBDEDE";
        System.out.println(T.solution(n , arr));
    }
}
