package com.algorithm.oriented_programming2023_2.GStack;

public class GStack<T> {
    int tos;
    Object[] stck;
    public GStack(){
        tos = 0;
        stck = new Object[10];
    }

    public void push(T item){
        if (tos ==10){
            return;
        }
        stck[tos] = item;
        tos++;
    }

    public T pop(){
        if (tos <0){
            return null;
        }
        else{
            tos --;
            return (T)stck[tos];
        }
    }

    public int size(GStack<T> gStack){
        int cnt = 0;
        while (gStack != null){
            gStack.pop();
            cnt++;
        }
        return cnt;
    }

    public int capacity(GStack<T> gStack){
        int cnt = 0;
        while (gStack !=null){
            gStack.pop();
            cnt++;
        }
        return stck.length - cnt;
    }


}
