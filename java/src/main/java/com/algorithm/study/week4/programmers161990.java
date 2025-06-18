package com.algorithm.study.week4;

public class programmers161990 {
    // 바탕화면 정리
    public int[] solution(String[] wallpaper) {
        int north = Integer.MAX_VALUE , west = Integer.MAX_VALUE , south = Integer.MIN_VALUE , east = Integer.MIN_VALUE;
        for (int i = 0 ; i < wallpaper.length ; i++){
            String[] row = wallpaper[i].split("");
            for (int j = 0 ; j < wallpaper[i].length(); j++){
                if (row[j].equals("#")) {
                    if (i < north) north = i; // 좌측 상단 y좌표
                    if (j < west) west = j; // 좌측 상단 x좌표
                    if (i > south) south = i; // 우측 하단 y좌표
                    if (j > east) east = j; // 우측 하단 x좌표
                }
            }
        }
        int [] answer = {north , west , south+1 , east+1};
        return answer;
    }

    public static void main(String[] args) {
        programmers161990 T = new programmers161990();

        String[] wallpaper = {".#...", "..#..", "...#."};
        System.out.println(T.solution(wallpaper));
    }
}
