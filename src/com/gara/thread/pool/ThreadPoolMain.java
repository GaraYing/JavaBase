package com.gara.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author GARA
 * @Description 测试主类
 * @Date 2020/8/30 18:29
 * @Version V1.0.0
 **/
public class ThreadPoolMain {

    public static void main(String[] args) throws InterruptedException {

        // 生产者-消费者模型
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            executorService.submit(new MyTask()); // 不断往线程池提交任务
            // 线程池中的线程不断处理任务
        }
        Thread.sleep(1000);
        executorService.shutdown();
        System.out.println("=========================================");
        MyBlockedQueue<MyTask> blockingQueue = new MyBlockedQueue<>();
        // 生产者生产任务
        Thread producer = new Thread(new Producer(blockingQueue), "producer");
        producer.start();

        Thread.sleep(1000);

        // 消费者消费任务
        Thread consumer  = new Thread(new Consumer(blockingQueue),"consumer");
        consumer.start();
    }
}
