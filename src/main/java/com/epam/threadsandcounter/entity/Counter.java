package com.epam.threadsandcounter.entity;

public class Counter {

    private int value = 0;

    public Counter() {
    }

    public synchronized int getValue() {
        return value;
    }

    public synchronized void increment() {
        value++;
    }
}
