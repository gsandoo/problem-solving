package com.algorithm.oriented_programming2023_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        int k;

        for (int i = 0; i < T; i++) {
            k = Integer.parseInt(br.readLine());

            String[] arr = new String[k];

            for (int j = 0; j < k; j++) {
                arr[j] = br.readLine();
            }

            String check = "";

            int checkNum = 0;

            Loop1:
            for (int j = 0; j < k; j++) {
                for (int l = i + 1; l < k; l++) {
                    if (j == l) {
                        break;
                    }
                    check = arr[j];
                    check += arr[l];

                    String palenCheck = new StringBuilder(check).reverse().toString();

                    if (check.equals(palenCheck)) {
                        System.out.println(check);
                        checkNum++;
                        break Loop1;
                    }
                    check = "";

                }
            }
            if (checkNum == 0) {
                System.out.println(checkNum);
            }
        }
    }
}