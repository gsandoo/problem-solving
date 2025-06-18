package com.algorithm.boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class 단어맞추기 {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();


        int T = Integer.parseInt(br.readLine());

        for (int i = 0 ; i < T ; i++){
            String token = br.readLine();

            int index = -1, index2= 0 ;

            char[] wchar  = token.toCharArray();

            for (int k = wchar.length-1 ; k > 0 ; k--){
                if (wchar[k] > wchar[k-1]) {
                    index = k-1;
                    break;
                }
            }
            if (index == -1){
                for (int l = 0; l < wchar.length ; l++){
                    answer.append(wchar[l]);
                }
                answer.append("\n");
            } else {
                for (int j = wchar.length-1 ; j >=0 ; j-- ){
                    if (wchar[j] > wchar[index]) {
                        index2 = j;
                        break;
                    }
                }
                char temp = wchar[index2];
                wchar[index2] = wchar[index];
                wchar[index] = temp;
                Arrays.sort(wchar,index+1,wchar.length);

                for (int l = 0; l < wchar.length ; l++){
                    answer.append(wchar[l]);
                }
                answer.append("\n");
            }
        }

        System.out.println(answer.toString());
    }
}
