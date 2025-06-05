package com.algorithm.programmers.고득점kit.완전탐색;

import java.util.HashSet;
import java.util.Set;

public class 소수찾기 {
    static boolean [] visited;
    static Set<Integer> hs;

    static void dfs(int L , String s, String numbers){
        if(L > numbers.length()){
            return;
        }
        else {
            for(int i = 0; i < numbers.length(); i++){
                if(!visited[i]){
                    visited[i] = true;
                    hs.add(Integer.parseInt(s + numbers.charAt(i)));
                    dfs(L+1, s +  numbers.charAt(i) , numbers);
                    visited[i] = false;
                }
            }
        }
    }

    int solution(String numbers) {
        int answer = 0;
        hs = new HashSet<>();
        visited = new boolean[7];

        dfs(0, "", numbers);
        for(int num : hs) {
            if(isPrime(num)) answer++;
        }

        return answer;
    }



    static boolean isPrime(int x){
        if (x < 2) {
            return false;
        }
        for (int i = 2; i <= (int) Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }

        return true;
    }


}
