//package com.example.algorithm.oriented_programming2023_2;
//
//import java.util.Iterator;
//import java.util.Vector;
//
//public class OrderItem {
//    private Vector<Coffee> coffees = new Vector<>();
//    ;
//
//    public void OrderItem(){
//        this.coffees = coffees;
//    }
//    public void saveItem(String name, int count, int price){
//
//        System.out.println("you ordered " + name + " and it's about " + count + " drink now.");
//
//        Iterator<Coffee> co = coffees.iterator();
//        while (co.hasNext()){
//            Coffee c = co.next();
//            if (c.getName().equals(name)){
//                price = c.getPrice() + price;
//                co.remove();
//            }
//        }
//        Coffee coffee = new Coffee(name, count, price);
//        coffees.add(coffee);
//    }
//
//    // iterator 사용
//    public void menuOrder(){
//        Iterator<Coffee> co = coffees.iterator();
//        int total = 0;
//        System.out.println("---------------------------");
//        System.out.println("     menu   count   price");
//        System.out.println("---------------------------");
//        while (co.hasNext()){
//            Coffee c = co.next();
//            total += c.getPrice();
//            c.printItem();
//        }
//        System.out.println("---------------------------");
//        System.out.println("total price         " + total);
//    }
//}
