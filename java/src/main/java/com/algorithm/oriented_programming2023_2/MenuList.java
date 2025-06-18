package com.algorithm.oriented_programming2023_2;

import java.util.HashMap;

public class MenuList {

    public HashMap<Integer,String> MenuList(){
        HashMap<Integer , String> menuList = new HashMap<>();
        menuList.put(1, "americano");
        menuList.put(2, "latte");
        menuList.put(3, "espresso");
        menuList.put(4, "order");
        return menuList;
    }

}
