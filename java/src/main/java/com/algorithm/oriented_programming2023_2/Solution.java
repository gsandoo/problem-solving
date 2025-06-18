//package com.example.algorithm.oriented_programming2023_2;
//
//import java.util.HashMap;
//import java.util.Scanner;
//
//public class Solution {
//
//    // 1. 해시멥 => 아메리 - 1500 , 라떼 - 2000, 에스프레소 - 3000 등으로 나눈다.
//    // 2.
//    public static void main(String[] args) {
//        boolean flag = true;
//
//        Scanner scanner = new Scanner(System.in);
//
//        HashMap<String , Integer> list = new HashMap<>(); // <커피 메뉴 , 갯수 > 해시맵
//        MenuList drink = new MenuList();
//        HashMap<Integer,String> menuList = drink.MenuList(); // 메뉴 해시맵
//
//        OrderItem item = new OrderItem();
//        while (flag){
//
//            System.out.println("1 : americano , 2 : latte , 3 : espresso , 4: order ");
//
//            System.out.print("choose menu: ");
//            int menu = scanner.nextInt();
//            String name = menuList.get(menu);
//
//            if (name.equals("order")){
//                item.menuOrder();
//                flag = false;
//            }
//            else {
//                CreatePrice createPrice = new CreatePrice();
//                int price = createPrice.CreatePrice(name);
//                list.put(name, list.getOrDefault(name, 0) + 1); // ex) espresso, 1
//                item.saveItem(name,list.get(name), price);
//            }
//        }
//    }
//}
