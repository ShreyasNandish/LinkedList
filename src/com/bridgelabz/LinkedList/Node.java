package com.bridgelabz.LinkedList;

public class Node<T> {

    T data;
    Node<T> next;

    Node<T> prev;

    public Node() {
    }

    public Node(T data) {

        this.data = data;
    }
}