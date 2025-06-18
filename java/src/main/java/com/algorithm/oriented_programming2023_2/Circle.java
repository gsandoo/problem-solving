package com.algorithm.oriented_programming2023_2;

public class Circle {
    public int radius;
    // 멤버변수 초기 값
    public Circle(){
        this.radius = 0; // 초기 값 선언
    }
    public Circle(int radius){
        this.radius = radius;
    }
    public double getArea(){
        return  3.14 * radius  * radius;
    }
}

