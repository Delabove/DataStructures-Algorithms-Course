package com.codewithdelayne;


public class Main {

    public static void main(String[] args) {
       Array cities = new Array(3);
       cities.insert("Dallas");
       cities.insert("Lafayette");
       cities.insert("Addison");
       cities.insert("Arlington");
       cities.removeAt(3);
       cities.print();
        System.out.println(cities.findIndex("Addison"));

    }
}
