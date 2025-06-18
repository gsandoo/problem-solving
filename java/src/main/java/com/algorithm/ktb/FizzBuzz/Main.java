package com.algorithm.ktb.FizzBuzz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static String fizzbuzz(String[] x){
        String answer = null;

        for (int i = 0 ; i < x.length; i++) {
            char[] carr = x[i].toCharArray();
            if(carr[0] < 65) {

            }
        }

        return answer;
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = new String[3];
        for (int i = 0 ; i < 3; i++){
            String word = br.readLine();
            arr[i] = word;
        }
        System.out.println(fizzbuzz(arr));
    }
}
