package com.algorithm.ssafy.D3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 3

        List<String> result = new ArrayList<>(); // 결과 배열


         for (int i = 0 ; i < T  ; i++){
            String test = sc.nextLine();

            String num = sc.nextLine();
            String[] n = num.split(" ");

            List<String[]> list = new ArrayList<>();

            // input 값 담아주기
            for (int j = 0 ; j < Integer.parseInt(n[0]) ; j++){
                String M =sc.nextLine();
                String[] m = M.split(" ");
                list.add(m);
            }

            // list 별로 돌기 시작
            boolean flag = false;
            if (list.size() < 2){
                for (int o = 0 ; o < list.get(0).length-1 ; o++){
                    if (flag) break;
                    if ((list.get(0)[o].equals(list.get(0)[o+1]))){
                        // result.add("#" + i+1 + " " + "impossible");
                        flag = true;
                        break;
                    }
//                    else{
//                        result.add("#" + i+1 + " " + "possible");
//                    }
                }
            }else{
                for (int l = 0 ; l < list.size() ; l ++){
                    if (flag) break;
                    for (int o = 0 ; o < list.get(l).length-1 ; o++){
                        if (flag) break;
                        if ((list.get(l)[o].equals(list.get(l+1)[o])) || (list.get(l)[o].equals(list.get(l)[o+1]))){
                            // result.add("#" + i+1 + " " + "impossible");
                            flag = true;
                            break;
                        }
//                    else{
//                        result.add("#" + i+1 + " " + "possible");
//                    }
                    }
                }
            }
            if (flag)result.add("#" + i+1 + " " + "impossible");
             else result.add("#" + i+1 + " " + "possible");
        }
        //결과 출력
        for (int i = 0 ; i < result.size(); i++){
            System.out.println(result.get(i));
        }
    }
}
