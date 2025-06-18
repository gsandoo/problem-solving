package com.algorithm.boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class 단어맞추기fail {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0 ; i < T ; i++){
            String token = br.readLine();

            boolean changed = false;
            int index = 0 ;

            char[] wchar  = token.toCharArray();

            for (int k = wchar.length-1 ; k > 0 ; k--){

                for (int j = k-1 ; j >= 0 ; j-- ){
                    if (wchar[k] > wchar[j]){
                        char tmp = wchar[k];
                        wchar[k] = wchar[j];
                        wchar[j] = tmp;

                        changed = true;
                        index = j+1;
                    }
                    else continue;
                    if (changed)break;
                }
                if (changed) break;
            }
            if (changed){
                Arrays.sort(wchar,index,wchar.length);
                for (int p = 0 ; p < wchar.length ; p++)answer.append(wchar[p]);
                answer.append("\n");

            } else {
                for (int p = 0 ; p < wchar.length ; p++)answer.append(wchar[p]);
                answer.append("\n");
            }

        }
        System.out.println(answer);
    }
}
