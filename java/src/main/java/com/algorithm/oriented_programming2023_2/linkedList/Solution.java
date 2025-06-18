package com.algorithm.oriented_programming2023_2.linkedList;


import java.util.Iterator;

public class Solution {

    public static <T> boolean isSaved(Queue<T> queue, T data){
        Iterator<T> it = queue.getIterator();
        T objsaved;
        boolean flag = false;
        while (it.hasNext()){
            objsaved = it.next();
            if (objsaved.equals(data)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Queue<Point> pointQueue = new Queue<Point>();
        Point point;
        point = new Point(3,2);
        if (isSaved(pointQueue, point) == false){
            pointQueue.enqueue(point);
            System.out.println("inserted");
        }else System.out.println("already inserted");

        System.out.println("2nd try");
        point = new Point(3,2);
        if (isSaved(pointQueue, point) == false){
            pointQueue.enqueue(point);
            System.out.println("inserted");
        }else System.out.println("already inserted");
    }
}
