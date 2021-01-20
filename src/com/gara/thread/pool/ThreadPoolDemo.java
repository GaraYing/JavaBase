package com.gara.thread.pool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ThreadPoolDemo {

    public static void main(String[] args) throws Exception {

        ThreadFactory factory = r -> {
            Thread thread = new Thread(r, "thread-abc");
            return thread;
        };

        ExecutorService executorService = Executors.newFixedThreadPool(10, factory);
//        ExecutorService executorService = Executors.newSingleThreadExecutor(factory);
//        ExecutorService executorService = Executors.newCachedThreadPool();

        List<Future<?> > list = new ArrayList<>(100);
        for (int i = 0; i < 100; i++) {
//            executorService.execute(new MyTask());
            Future<?> submit = executorService.submit(new MyTask());
            list.add(submit);
        }

//        Callable<Object> callable = Executors.callable(() -> System.out.println(Thread.currentThread().getName()));
//
//        Object call = callable.call();
//
//        System.out.println(call);
    }
}
