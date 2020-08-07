package com.codewithdelayne;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
       Array numbers = new Array(3);

       numbers.insert(10);
       numbers.insert(20);
       numbers.insert(30);
       numbers.insert(40);
       numbers.insert(50);
       numbers.remove(2);
       numbers.reverse();
//       numbers.print();

        System.out.println(numbers.indexOf(10));
        System.out.println(numbers.max());
//        System.out.println(numbers.intersection()); FIGURE OUT HOW TO TEST?


        var list = new LinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
    }



}
