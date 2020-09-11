package com.gara.thread.pool;

/**
 * @Author GARA
 * @Description 线程生产者
 * @Date 2020/8/30 18:22
 * @Version V1.0.0
 **/
public class Producer implements Runnable {

    private final MyBlockedQueue<MyTask> blockedQueue;

    public Producer(MyBlockedQueue<MyTask> blockedQueue) {
        this.blockedQueue = blockedQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("produce : " + i);
            try {
                //  如果队列满，则阻塞
                this.blockedQueue.put(new MyTask());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
