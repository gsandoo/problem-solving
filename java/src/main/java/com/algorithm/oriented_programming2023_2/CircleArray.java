package com.algorithm.oriented_programming2023_2;

public class CircleArray {

    public static void main(String[] args) {
        int iRadius ;
        double dArea;
        Circle[] circleArray;
        circleArray = new Circle[5];

        for (int i = 0 ; i < circleArray.length; i++){
            iRadius = i + 5;
            circleArray[i] = new Circle(iRadius);
        }
        for (int i = 0 ; i < circleArray.length ; i++){
            dArea = circleArray[i].getArea();
            System.out.println((int)circleArray[i].getArea()+ " ");
        }
    }
}
