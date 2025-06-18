package com.algorithm.oriented_programming2023_2;

import java.util.Arrays;
import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0 , i = 0;
        int[] array = new  int[5];
        while (count < 5){
            System.out.println("5 times of number inserting");
            int num = scanner.nextInt();
            if (num >0){
                array[i] = num;
                i++;
                count ++;
            }else{
                 System.out.println("not positive");
                }
            }
        Arrays.sort(array);
        System.out.println("max value : " + array[array.length-1]);
        System.out.println("second max value: " + array[array.length-2]);
        scanner.close();
    }
}
