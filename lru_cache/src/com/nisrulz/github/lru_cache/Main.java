package com.nisrulz.github.lru_cache;

public class Main {

    public static void main(String[] args) {
        LruCache lruCache = new LruCache(5);
        lruCache.set(1, 1);
        lruCache.set(2, 2);
        lruCache.set(3, 3);
        lruCache.set(4, 4);
        lruCache.set(5, 5);
        lruCache.set(6, 6);

        int val = lruCache.get(2);

        System.out.println(val);

        lruCache.set(7, 7);

        val = lruCache.get(5);
        System.out.println(val);
    }
}
