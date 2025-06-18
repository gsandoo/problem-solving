package com.algorithm.oriented_programming2023_2.linkedList;

import java.util.Objects;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object obj) {
        boolean bRes = true;
        Circle circle = (Circle) obj;
        if (this.radius == circle.radius) bRes = true;
        else bRes = false;
        return  bRes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
}
