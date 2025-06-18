package com.algorithm.oriented_programming2023_2;

public class Gugudan {
    public static void main(String[] args) {
        for (int i = 1; i < 10 ; i++){
           for (int j = 1; j < 10; j++){
               System.out.print(i+"*"+j +"=" + i*j + " ");
               if (j == 3 || j == 6 || j== 9){
                   System.out.println();
               }
           }
        }
    }
}
