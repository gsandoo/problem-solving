package com.algorithm.oriented_programming2023_2.linkedList;

import java.util.Objects;

public class Point {
    private int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        boolean bRes = true;
        Point point = (Point) obj;
        if (this.x == point.x && this.y == point.y) bRes = true;
        else bRes = false;
        return  bRes;
    }


    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
