package com.algorithm.inflearn.스택과큐;

import java.util.Comparator;
import java.util.PriorityQueue;

class Student {
    int mathScore; // 수학점수
    int engScore;  // 영어점수

    public Student(int mathScore, int engScore){
        this.mathScore = mathScore;
        this.engScore = engScore;
    }
}
// 클래스 객체의 우선순위를 위한 클래스
class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.mathScore == o2.mathScore) {
            return o2.engScore - o1.engScore;
        } else {
            return o1.mathScore - o2.mathScore;
        }
    }
}

public class 우선순위큐예제 {

    public static void main(String[] args) {

        // 클래스 객체에 대한 우선순위 기준 제공
        PriorityQueue<Student> pQ = new PriorityQueue<>(1, new StudentComparator());

        pQ.offer(new Student(70, 50));  // 우선순위 큐에 클래스 객체를 추가
        pQ.offer(new Student(60, 50));  // 우선순위 큐에 클래스 객체를 추가
        pQ.offer(new Student(70, 40));  // 우선순위 큐에 클래스 객체를 추가

        while (!pQ.isEmpty()) {
            Student s = pQ.poll();
            System.out.printf("Student\'s MathScore and engScore: %d, %d \n", s.mathScore, s.engScore);
        }
    }
}
