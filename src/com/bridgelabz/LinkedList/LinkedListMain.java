package com.bridgelabz.LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);

        linkedList.print();
        System.out.println();

        System.out.println(linkedList.insertAfter(30,40));
        linkedList.print();
    }
}
