package com.bridgelabz.LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.push(56);
        linkedList.push(30);
        linkedList.push(70);

        linkedList.print();
        System.out.println();

        LinkedList<Integer> linkedList1 = new LinkedList<>();

        linkedList1.add(56);
        linkedList1.add(30);
        linkedList1.add(70);

        linkedList1.print();
    }
}
