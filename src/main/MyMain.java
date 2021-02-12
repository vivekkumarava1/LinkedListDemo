package main;

import implementation.MySinglyLinkedList;

public class MyMain {
    public static void main(String[] args) {
        MySinglyLinkedList linkedList = new MySinglyLinkedList();
        linkedList.addfirst(500);
        //linkedList.traverse();
        linkedList.addfirst(700);
        linkedList.addfirst(200);
        linkedList.addfirst(600);
        linkedList.addfirst(230);
        linkedList.addfirst(453);
        linkedList.traverse();
        System.out.println();
        System.out.println("size = "+ linkedList.size());
        linkedList.addAfterGivenNode(500,100);
        linkedList.traverse();
    }
}
