package com.algorithm.oriented_programming2023_2.linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Queue<T> {
    private LinkedList<T> linkedList; // 가능하면 생성자에 만들기

    public Queue() {
        this.linkedList = new LinkedList<>();
    }

    public void enqueue(T data){
        linkedList.add(data);
    }

    public T dequeue(){
       T res;
       if (linkedList.isEmpty() == false){
           res = linkedList.remove(0);
       }else {
           res = null;
       }
       return res;
    }

    public Iterator<T> getIterator(){
        Iterator<T> it = linkedList.iterator();
        return it;
    }

}
