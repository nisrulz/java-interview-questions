package com.nisrulz.github.queue;

interface Queue {
    int size();

    void enqueue(int data);

    int dequeue();
}
