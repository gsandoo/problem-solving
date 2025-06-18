package com.algorithm.oriented_programming2023_2;

public class GugudanUpgrade {
    public static void main(String[] args) {
        for (int i = 1; i < 10 ; i++){
            for (int j = 1 ; j < 4 ; j ++){
                System.out.print( j +" * "+i+" =  "+ j * i + "      ");
            }
            System.out.println();
        }
        for (int i = 1; i < 10 ; i++){
            for (int j = 4 ; j < 7 ; j ++){
                System.out.print( j +" * "+i+" =  "+ j * i + "      ");
            }
            System.out.println();
        }
        for (int i = 1; i < 10 ; i++){
            for (int j = 7 ; j < 10 ; j ++){
                System.out.print( j +" * "+i+" =  "+ j * i + "      ");
            }
            System.out.println();
        }
    }
}
