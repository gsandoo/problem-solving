package com.algorithm.ktb.JavavsCplpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 class Solution {
    static StringBuilder sb;



    public static boolean isC(String a){
        if (a.contains("__") || a.startsWith("_") || a.endsWith("_")) return false;
        for (char x : a.toCharArray()) if(Character.isUpperCase(x)) return false;
        return true;
    }

    public static boolean isJ(String a){
        return Character.isLowerCase(a.charAt(0)) && !a.contains("_");
    }


    public static String Csolution(String a) {
        sb = new StringBuilder();
        boolean flag = false;

        for (int i = 0; i < a.length(); i++) {
            char x = a.charAt(i);

            if (x == '_') {
                if (flag || i == 0 || i == a.length() - 1) {
                    return "Error!";
                }
                flag = true;
            } else {
                if (flag) {
                    if (!Character.isLowerCase(x)) return "Error!";
                    sb.append(Character.toUpperCase(x));
                    flag = false;
                } else {
                    sb.append(x);
                }
            }
        }
        return sb.toString();
    }

    public static String Jsolution(String a) {
        sb = new StringBuilder();
        for (char x : a.toCharArray()) {
            if (Character.isUpperCase(x)) {
                sb.append("_");
                sb.append(Character.toLowerCase(x));
            } else {
                sb.append(x);
            }
        }
        return sb.toString();
    }



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        if (s.isEmpty() || !Character.isLetter(s.charAt(0))) {
            System.out.println("Error!");
            return;
        }

        if (isC(s)) {
            System.out.println(Csolution(s));
        } else if (isJ(s)) {
            System.out.println(Jsolution(s));
        } else {
            System.out.println("Error!");
        }
    }
}
