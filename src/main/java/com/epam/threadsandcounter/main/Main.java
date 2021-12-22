package com.epam.threadsandcounter.main;

import com.epam.threadsandcounter.entity.Counter;
import com.epam.threadsandcounter.runnable.CounterIncrementer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class Main {

    private static final int INCREMENTER_NUMBER = 10;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(INCREMENTER_NUMBER);
        Counter counter = new Counter();
        IntStream.range(0, 10)
                .mapToObj(thread -> new Thread(new CounterIncrementer(counter)))
                .forEach(executorService::submit);
//        for (int i = 0; i < INCREMENTER_NUMBER; i++) {
//            executorService.submit(new CounterIncrementer(counter));
//        }
        executorService.shutdown();
        //executorService.awaitTermination(1, TimeUnit.HOURS);
        //while (!executorService.isShutdown()) ;
        System.out.println(counter.getValue());
    }
}
