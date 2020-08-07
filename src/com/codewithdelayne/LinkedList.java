package com.codewithdelayne;

public class LinkedList {

   private class Node {
        private int value;
        private Node next;


        public Node(int value){
            this.value = value;

        }
    }



    private Node first;
    private Node last;

    //ADD LAST

    //link to previous node

    public void addLast(int item){
        //create node object
        var node = new Node(item);
        //insert into last -first check if empty
        if(first == null){
            first = last = node;
            //link to tail
        } else {
            last.next = node;

        } last = node;

    }



}
