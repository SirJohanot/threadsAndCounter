package com.epam.threadsandcounter.entity;

public class Counter {

    int val = 0;

    public Counter() {
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public void increment() {
        val++;
    }
}
