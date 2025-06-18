package com.algorithm.ssafy.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 20551. 증가하는 사탕 수열
 *
 4
 3 2 1
 1 2 3
 3 5 5
 5 6 6
 *
 */
public class Test6 {

    public int solution(int[]arr){

        int answer = 0;
        if (arr.length < 3) answer= -1;
        if (arr[1] >=2 && arr[2] >=3 ){ // 3 2 1 이나 1 1 3 같은 경우 제외
            if ((arr[0] < arr[1] && arr[1] < arr[2]) || (arr[0] == arr[1] && arr[1] == arr[2])) answer = 0; // 1, 2, 3 or 7, 7, 7
            else{
                answer = arr[0] - (arr[2] -2 );
                answer += arr[1] - (arr[2]- 1);
            }
        }else answer = -1;

        return  answer;
    }

    public static void main(String[] args) throws IOException {

        Test6 test6 = new Test6();
        // 1. 스캐너 역할
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 2. 테스트 케이스 입력
        int Tc = Integer.parseInt(br.readLine());

        for (int i = 1 ; i <= Tc ; i++){

            int[] arr = new int[3];

            // 3. 3 5 1 -> " " 기준으로 토크나이저 생성 split
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line, " ");

            // 4. 값 넣기
            for (int j = 0 ; st.hasMoreTokens() ; j++){
                arr[j] = Integer.parseInt(st.nextToken());
            }

            System.out.println("#"+i + " " + test6.solution(arr));
        }
    }
}
