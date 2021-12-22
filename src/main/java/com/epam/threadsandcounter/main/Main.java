package com.epam.threadsandcounter.main;

import com.epam.threadsandcounter.entity.Counter;
import com.epam.threadsandcounter.runnable.CounterIncrementer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    private static final int INCREMENTER_NUMBER = 10;

    public static void main(String[] args) {
        Counter counter = new Counter();
        for (int i = 0; i < INCREMENTER_NUMBER; i++) {
            Thread thread = new Thread(new CounterIncrementer(counter));
            thread.start();
        }
    }
}
