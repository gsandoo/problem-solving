package com.algorithm.study;

public class AddOneToTen {
    public int solution(){
        int answer = 0;
        for (int i = 1 ; i < 11; i++){
            answer+=i;
        }
        return answer;
    }
    public static void main(String[] args) {
        AddOneToTen s = new AddOneToTen();
        System.out.println( s.solution());
    }
}
