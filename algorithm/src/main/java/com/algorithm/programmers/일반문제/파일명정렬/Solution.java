package com.algorithm.programmers.일반문제.파일명정렬;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {

    public static String[] solution(String[] files) {
        Arrays.sort(files, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String[] file1 = splitFile(o1);
                String[] file2 = splitFile(o2);

                int result = file1[0].compareTo(file2[0]);

                // head 값이 서로 같다면 number 값으로 비교
                if (result == 0) {
                    int number1 = Integer.parseInt(validateNumber((file1[1])));
                    int number2 = Integer.parseInt(validateNumber((file2[1])));
                    return number1 - number2;
                }
                return result;
            }
        });

        return files;
    }

    public static String[] splitFile(String file) {
        file = file.toLowerCase();

        String head = file.split("[0-9]")[0];
        String number = file.substring(head.length());
        String[] separateFile = {head, number};
        return separateFile;
    }

    private static String validateNumber(String number) {
        StringBuilder sb = new StringBuilder();
        for (char c : number.toCharArray()) {
            // 숫자이고 길이가 5를 넘어가지 않는다면
            if (Character.isDigit(c) && sb.length() <= 5) {
                sb.append(c);
            } else {
                return sb.toString();
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                solution(new String[]{"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"})));
        System.out.println(Arrays.toString(
                solution(new String[]{"F-5 Freedom Fighter", "B-50 Superfortress", "A-10 Thunderbolt II",
                        "F-14 Tomcat"})));
    }
}
