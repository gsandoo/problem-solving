package com.algorithm.programmers.일반문제.귤고르기;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Solution {

    public int solution(int k, int[] tangerine) {
        int answer = 0; int sum = 0; int cnt = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int num : tangerine){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        ArrayList<Integer> arr = new ArrayList<>(map.values());
        Collections.sort(arr, Collections.reverseOrder()); // 내림차순으로 정렬

        for (int x: arr
             ) {
            if (sum + x >= k){
                cnt++;
                break;
            }else{
                sum += x;
                cnt++;
            }
        }

        answer = cnt;
        return answer;
    }
    public static void main(String[] args) {
        int k= 6;
        int [] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};
        Solution s = new Solution();
        System.out.println(s.solution(k, tangerine));
    }
}
