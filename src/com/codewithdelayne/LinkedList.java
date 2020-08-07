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
    public void addLast(int item){
        var node = new Node(item);
        if(first == null){
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }

    }

    public void addFirst(int item){
        var node = new Node (item);

        if(first == null){
            first = last = node;
        } else{
            node.next = first;
            first = node;
        }

    }

    // INDEX OF (traverse through the list from beginning to end and return in dex of the item param when you find it)

    //declare index var
    //declare a current placeholder variable
    //check if null
    //check value of current node is equal to index
    //increment
    //return statement if does not match
    //test

    public int indexOf(int item) {
        var index = 0;
        var current = first;
        while (current != null) {
            if (current.value == item)
                return index;
                current = current.next;
                index++;

        }
            return -1;
    }

    public void removeFirst(){
        var second = first.next;
        first.next = null;
        first = second;
    }



    public boolean contains(int item){
        return indexOf(item) != -1;
    }

}


