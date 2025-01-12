package com.algorithm.boj.solvedac.bronze;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;


/*
* hash set :
* 순서의 개념이 없다
* 동일한 값 허용 안한다
* 만약 정렬을 원하면 배열로 변환 후 collections.sort 해라
*
* */
public class 나머지 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0 ; i < 10 ; i++) {
            hs.add(Integer.parseInt(br.readLine()) % 42);
        }
        System.out.println(hs.size());
    }
}
