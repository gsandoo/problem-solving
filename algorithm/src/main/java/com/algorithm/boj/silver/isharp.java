package com.algorithm.boj.silver;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// tier: silver
// link:https://www.acmicpc.net/problem/3568
public class isharp {

    static String word;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ,;");

        String[] arr = new String[st.countTokens()];

        for (int i = 0; i < arr.length; i++){
            String token = st.nextToken();
            arr[i] = token;
        }

        ArrayList<String> words = new ArrayList<>();

        for (int i = 1 ; i < arr.length; i++){
            sb = new StringBuilder();
            sb.append(arr[0]);
            String rev = new StringBuilder(arr[i]).reverse().toString();
            for (char x : rev.toCharArray()){
                if (Character.isAlphabetic(x)){
                   sb.append(" ");
                   sb.append(x);
                }
                else{
                    if (x == '[') {
                        sb.append('[');
                        sb.append(']');
                    } else if (x == ']') {
                        continue;
                    } else sb.append(x);
                }
            }
            sb.append(";");
            word = sb.toString();
            words.add(word);
        }

        for (int i = 0 ; i < words.size(); i++){
            System.out.println(words.get(i));
        }
    }
}
