package com.algorithm.ktb.소수구하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        boolean[] arr = new boolean[N + 1];
        StringBuilder sb = new StringBuilder();

        //0과 1은 소수가 아니다.
        arr[0] = true;
        arr[1] = true;
        // 소수 구하기 = 에라토스테네스의 체!!! 1~10이라 할때 2*2= 4, 3*3 = 9, 4*4 는 10을 넘으니 2,3 두번 반복한다.
        for (int i = 2; i*i <= N; i++) {
            if (!arr[i]) {
                // 소수가 아니면 2인 경우 4,6,8,10 을 true로 둔다. 3이면 3,6,9를 둔다.
                for (int j = i * i ; j <= N ; j +=i) {
                    arr[j] = true;
                }
            }
        }
        // 그러면 1을 제외하고 2,3,4,6,8,9,10이 true고 남은 수인 1,5,7 은 소수다.
        for(int i = M; i <= N; i++) {
            if(!arr[i]) sb.append(i).append("\n");
        }
        System.out.println(sb);
    }
}