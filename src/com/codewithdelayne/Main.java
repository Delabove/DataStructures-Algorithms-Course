package com.codewithdelayne;


public class Main {

    public static void main(String[] args) {
        Array subjects = new Array(3);
        subjects.insert("Math");
        subjects.insert("Science");
        subjects.insert("English");
        subjects.insert("Social Studies");
        subjects.removeAt(2);
        subjects.print();
        System.out.println(subjects.findIndexOf("Science"));

    }
}
