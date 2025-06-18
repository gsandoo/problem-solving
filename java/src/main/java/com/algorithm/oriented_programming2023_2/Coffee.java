package com.algorithm.oriented_programming2023_2;

import java.util.Scanner;

public class Coffee {
    public int[] solution() {
        int[] answer = new int[5];
        int totalSum = 0;
        int[] menuArr = {0,0,0,0};
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        while (flag) {
            System.out.println("coffee insert : 0 quit");
            System.out.println("1 : americano , 2 : latte , 3 : caramel makiyato , 4: espresso");
            int num = scanner.nextInt();
            switch (num) {
                case 1:
                    totalSum += 1500;
                    menuArr[0] +=1;
                    break;
                case 2:
                    totalSum += 2000;
                    menuArr[1] +=1;
                    break;
                case 3:
                    totalSum += 2500;
                    menuArr[2] +=1;
                    break;
                case 4:
                    totalSum += 3000;
                    menuArr[3] +=1;
                    break;
                case 0:
                    flag = false;
                default:
                    System.out.println("no menu.");
            }
        }
        answer[0] = totalSum;
        for (int i = 0 ; i < menuArr.length;i++){
            answer[i+1] = menuArr[i];
        }
        return answer;
    }
        public static void main(String[] args) {
            int count = 0;
            Coffee t = new Coffee();
            for (int x: t.solution()
                 ) {
                if (count==0){
                    System.out.println("coffee total : " + x);
                    count++;
                }
                else if (count==1){
                    System.out.println("americano total : " + x);
                    count++;
                }
                else if (count==2){
                    System.out.println("latte total : " + x);
                    count++;
                }
                else if (count==3){
                    System.out.println("caramel : " + x);
                    count++;
                }
                if (count==4){
                    System.out.println("espresso : " + x);
                    count++;
                }
            }
    }
}
