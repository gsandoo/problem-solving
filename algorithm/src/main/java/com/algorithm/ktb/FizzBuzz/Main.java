package com.algorithm.ktb.FizzBuzz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static String fizzbuzz(String[] x){
        if (Integer.parseInt(x[2] + 1)%3 == 0 && Integer.parseInt(x[2] + 1)%5 == 0) return "FizzBuzz";
        else if (Integer.parseInt(x[2] + 1)%3 == 0 && Integer.parseInt(x[2] + 1)%5 != 0) return "Fizz";
        else if (Integer.parseInt(x[2] + 1)%3 != 0 && Integer.parseInt(x[2] + 1)%5 == 0) return "Buzz";
        else return (x[2] + 1);
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
