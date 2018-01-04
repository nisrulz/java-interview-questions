package com.nisrulz.github.lru_cache;

import java.util.HashMap;

public class LruCache {

    int capacity;
    HashMap<Integer, Node> mapOfData = new HashMap<>();
    Node head = null;
    Node end = null;

    public LruCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if (mapOfData.containsKey(key)) {
            Node n = mapOfData.get(key);
            remove(n);
            setHead(n);
            return n.value;

        }
        return -1;
    }

    public void set(int key, int value) {
        if (mapOfData.containsKey(key)) {
            Node oldNode = mapOfData.get(key);
            oldNode.value = value;
            remove(oldNode);
            setHead(oldNode);
        } else {
            Node createdNode = new Node(key, value);
            if (mapOfData.size() >= capacity) {
                mapOfData.remove(end.key);
                remove(end);
                setHead(createdNode);
            } else {
                setHead(createdNode);
            }
            mapOfData.put(key, createdNode);

        }
    }

    private void setHead(Node n) {
        n.next = head;
        n.prev = null;

        if (head != null) {
            head.prev = n;
        }

        head = n;
        if (end == null) {
            end = head;
        }

    }

    private void remove(Node n) {
        if (n.prev != null) {
            n.prev.next = n.next;
        } else {
            head = n.next;
        }

        if (n.next != null) {
            n.next.prev = n.prev;
        } else {
            end = n.prev;
        }
    }
}
