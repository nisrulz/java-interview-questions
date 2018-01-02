package com.nisrulz.github.linked_list;

public class Main {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        System.out.println("\nAdding 10 to front and 20,40 to back");
        linkedList.insertNodeAtFront(10);
        linkedList.insertNodeAtBack(20);
        linkedList.insertNodeAtBack(40);
        linkedList.printLinkedList();

        System.out.println("\nAdding 30 after 20");
        linkedList.insertNodeAfter(linkedList.getNode(20), 30);
        linkedList.printLinkedList();

        System.out.println("\nAdding 5 to front");
        linkedList.insertNodeAtFront(5);
        linkedList.printLinkedList();

        System.out.println("\nAdding 45 to back");
        linkedList.insertNodeAtBack(45);
        linkedList.printLinkedList();
    }
}
