package com.nisrulz.github.lru_cache;

public class Node {

    int key;
    int value;

    Node prev;
    Node next;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
        this.prev = null;
        this.next = null;
    }
}
