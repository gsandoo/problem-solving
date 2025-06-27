package com.algorithm.코딩테스트.완전탐색;

import java.io.*;
import java.util.*;

class Book {
    int price;
    String name;

    Book(int price, String name){
        this.price = price;
        this.name = name;
    }
}
class Main {
    static List<Book> li = new ArrayList<>();
    static String word;
    static int n , min = Integer.MAX_VALUE;
    static int[] count = new int[26];
    static int[] select = new int[26];

    static void dfs(int level, int total){
        if (level == n){
            if (isCheck()){
                min = Math.min(min,total);
            }
            return;
        }
        // 책 사용하는 경우
        for(int i=0;i<li.get(level).name.length();i++){
            select[li.get(level).name.charAt(i)-'A']++;
        }
        dfs(level+1,total+li.get(level).price);
        // 책 안사용하는 경우
        for(int i=0;i<li.get(level).name.length();i++){
            select[li.get(level).name.charAt(i)-'A']--;
        }
        dfs(level+1,total);
    }

    static boolean isCheck(){
        for (int i = 0 ; i < 26; i++){
            if (count[i] > select[i]) return false;
        }
        return true;
    }
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        word = br.readLine();
        n  = Integer.parseInt(br.readLine());

        // 만들고 싶은 단어의 구성된 알파벳의 배열 값을 1로 변경
        for (int i = 0 ; i  < word.length(); i ++){
            count[word.charAt(i) - 'A'] ++ ;
        }
        // 반복 저장

        for(int i = 0; i < n; i++){
            String[] books = br.readLine().split(" ");
            int price = Integer.parseInt(books[0]);
            String book = books[1];
            li.add(new Book(price, book));
        }

        // 재귀 + 브루트포스 + 백트래킹
        dfs(0,0);
        System.out.println(min==Integer.MAX_VALUE?-1:min);
    }
}