package com.algorithm.ktb.나이순정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class Profile implements Comparable<Profile> {
    int age;
    String name;

    Profile(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Profile o) {
        return this.age - o.age;
    }
}


class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N=  Integer.parseInt(br.readLine());

        List<Profile> arr =new ArrayList<>();
        for (int i = 0 ; i < N ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            Profile profile = new Profile(Integer.parseInt(st.nextToken()), st.nextToken());
            arr.add(profile);
        }

        Collections.sort(arr);

        for (int i = 0 ; i < N ; i++){
            System.out.println(arr.get(i).age + " " + arr.get(i).name);
        }
    }
}
