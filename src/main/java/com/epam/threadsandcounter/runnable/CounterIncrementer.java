package com.epam.threadsandcounter.runnable;

import com.epam.threadsandcounter.entity.Counter;

public class CounterIncrementer implements Runnable {

    private static final int TIMES_TO_INCREMENT = 100;

    private final Counter counter;

    public CounterIncrementer(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < TIMES_TO_INCREMENT; i++) {
            counter.increment();
        }
    }
}
