package com.gara.thread.pool;

/**
 * @Author GARA
 * @Description 线程消费类
 * @Date 2020/8/30 18:19
 * @Version V1.0.0
 **/
public class Consumer implements Runnable {

    private final MyBlockedQueue<MyTask> blockedQueue;

    public Consumer(MyBlockedQueue<MyTask> blockedQueue) {
        this.blockedQueue = blockedQueue;
    }

    @Override
    public void run() {
        // 线程复用
        while (true) {
            try {
                // 阻塞队列：队列满了会阻塞生产者，队列空了会阻塞消费者
                MyTask myTask = blockedQueue.take();
                System.out.println("Consumer : " + myTask.hashCode());
                myTask.run();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
