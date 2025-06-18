package com.algorithm.inflearn.section4.공통원소구하기;

import java.util.HashMap;
// 아나그램
//설명
//
//Anagram이란 두 문자열이 알파벳의 나열 순서를 다르지만 그 구성이 일치하면 두 단어는 아나그램이라고 합니다.
//
//예를 들면 AbaAeCe 와 baeeACA 는 알파벳을 나열 순서는 다르지만 그 구성을 살펴보면 A(2), a(1), b(1), C(1), e(2)로
//
//알파벳과 그 개수가 모두 일치합니다. 즉 어느 한 단어를 재 배열하면 상대편 단어가 될 수 있는 것을 아나그램이라 합니다.
//길이가 같은 두 개의 단어가 주어지면 두 단어가 아나그램인지 판별하는 프로그램을 작성하세요. 아나그램 판별시 대소문자가 구분됩니다.
public class q2 {
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
        q2 T = new q2();
        String arr = "abaCC";
        String arr2 = "baeeACA";
        System.out.println(T.solution(arr, arr2));
    }
}
