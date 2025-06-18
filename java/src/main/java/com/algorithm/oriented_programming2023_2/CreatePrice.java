package com.algorithm.oriented_programming2023_2;

public class CreatePrice {
    public int CreatePrice(String name) {
        int price = 0;
        if (name.equals("americano")){
            price = 1500;
        } else if (name.equals("latte")) {
            price = 3000;
        } else if (name.equals("espresso")) {
            price = 2000;
        }
        return price;
    }
}
