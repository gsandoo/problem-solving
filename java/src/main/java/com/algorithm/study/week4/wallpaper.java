package com.algorithm.study.week4;

public class wallpaper {
    public int[] solution(String[] wallpaper) {
        int north = Integer.MAX_VALUE , west = Integer.MAX_VALUE , south = Integer.MIN_VALUE , east = Integer.MIN_VALUE;
        for (int i = 0 ; i < wallpaper.length ; i++){
            String[] row = wallpaper[i].split("");
            for (int j = 0 ; j < wallpaper[i].length(); j++){
                if (row[j].equals("#")) {
                    if (i < north) north = i;
                    if (j < west) west = j;
                    if (i > south) south = i ;
                    if (j > east) east = j ;
                }
            }
        }
        int [] answer = {north , west , south+1 , east+1};
        return answer;
    }

    public static void main(String[] args) {
        wallpaper T = new wallpaper();

        String[] wallpaper = {".#...", "..#..", "...#."};
        System.out.println(T.solution(wallpaper));
    }
}
