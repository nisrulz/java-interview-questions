package com.nisrulz.github.linked_list;

public class LinkedList {
    private Node head;

    class Node {
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertNodeAtFront(int new_data) {

        /* 1 & 2: Allocate the Node & Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;
        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    public void insertNodeAtBack(int new_data) {

        /* 1 & 2: Allocate the Node & Put in the data*/
        Node new_node = new Node(new_data);

        /* 2. If list is empty, assign head to new node */
        if (head == null) {
            head = new_node;
            return;
        }

        /* 4. Else traverse till the last node */
        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }

        /* 5. Change the next of last node */
        lastNode.next = new_node;
    }


    public void insertNodeAfter(Node prev_node, int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
    }

    public Node getNode(int data) {
        Node tempNode = head;
        while (tempNode.data != data) {
            tempNode = tempNode.next;
        }

        return tempNode;
    }

    public void deleteNode(int data) {
        Node nodeToBeDeleted = head;
        Node prevNode = null;

        if (nodeToBeDeleted != null && nodeToBeDeleted.data == data) {
            head = nodeToBeDeleted.next;
            return;
        }

        while (nodeToBeDeleted.data != data) {
            prevNode = nodeToBeDeleted;
            nodeToBeDeleted = nodeToBeDeleted.next;
        }

        if (nodeToBeDeleted == null) {
            return;
        }

        prevNode.next = nodeToBeDeleted.next;
    }

    public void printLinkedList() {
        Node tempNode = head;
        while (tempNode.next != null) {
            System.out.print(" > " + tempNode.data);
            tempNode = tempNode.next;
        }
        // print the last node
        System.out.print(" > " + tempNode.data);
    }

}
