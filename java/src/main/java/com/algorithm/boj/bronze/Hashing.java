package com.algorithm.boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Hashing {

    static int r,M,N;

    public static BigInteger solution(char[] a){

        r = 31;
        M = 1234567891;
        BigInteger answer = new BigInteger("0");

        for (int i = 0 ; i < a.length; i++){
            int x = a[i] - 'a' + 1;
            answer = answer.add(BigInteger.valueOf(x).multiply(BigInteger.valueOf(r).pow(i)));
        }

        answer = answer.mod(BigInteger.valueOf(M));
        return answer;
    }

//    public static long powMod(int exponent, int base, int mod){
//        long result = 1;
//        long currentPower = base;
//
//        while (exponent > 0){
//            if (exponent % 2 == 1){
//                result = (result * currentPower) % mod;
//            }
//            currentPower = (currentPower*currentPower) % mod;
//            exponent /= 2 ;
//        }
//
//        return result;
//    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        char[] arr = br.readLine().toCharArray();
        System.out.println(solution(arr));
    }
}
