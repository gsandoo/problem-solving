package com.algorithm.programmers.고득점kit.hashmap.LV3;

// https://school.programmers.co.kr/learn/courses/30/lessons/42579?language=java


import java.util.*;

class 베스트앨범 {
    class Song {
        String genre;
        Integer play;
        Integer idx;

        public Song(String genre, Integer play, Integer idx) {
            this.genre = genre;
            this.play = play;
            this.idx = idx;
        }
    }

    public int[] solution(String[] genres, int[] plays) {
        List<Integer> answer = new ArrayList<>();
        HashMap<String, Integer> hm = new HashMap<>();

        // 해시맵에 장르, 조회수로 저장
        for(int i = 0 ; i< genres.length ; i++) hm.put(genres[i], hm.getOrDefault(genres[i], 0)+plays[i]);

        // song 객체 저장 => 인덱스 파악
        List<Song> songList = new ArrayList<>();

        for(int i = 0 ; i < genres.length ; i++) songList.add(new Song(genres[i], plays[i], i));


        // 장르가 1개일 때
        if (genres.length < 2) {
            answer.add(songList.get(0).idx);
            return answer.stream().mapToInt(Integer::intValue).toArray();
        }

        // 재생 횟 수 큰 장르 파악하기
        // pop : 3150 , classic : 1550
        List<Map.Entry<String, Integer>> genreList = new ArrayList<>(hm.entrySet());
        genreList.sort((a, b) -> b.getValue() - a.getValue());

        // SongList를 sorting 하기
        songList.sort((a, b) -> {
            if (a.play.equals(b.play)) return a.idx - b.idx;
            return b.play - a.play;
        });

        // songList ->  장르와 재생 수가 같으면 idx 오름차순, 장르만 같으면 재생 수 내림차 순 ,아니면 정렬 x
        // [{classic,800,3}, {classic, 500,0}, {classic, 150,2}, {pop, 2500, 4},{pop, 600, 1}]
        // genreList -> (pop : 3150), (classic:1550) ...

        // songList에서 필터링해서 2곡 씩 남기기
        for (Map.Entry<String,Integer> genre : genreList) {
            int count = 0;
            for (Song song : songList) {
                if (song.genre.equals(genre.getKey())) {
                    answer.add(song.idx);
                    count++;
                    if (count == 2) break;
                }
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        베스트앨범 b = new 베스트앨범();
        String[] genre = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        System.out.println(b.solution(genre, plays));
    }
}
