package com.gara.thread.lock;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.LockSupport;

/**
 * @Author GARA
 * @note CompareAndSwap 底层指令： lock cmpxchg指令
 * @Description 自定义锁
 * @Date 2019/12/28 16:41
 * @Version V1.0.0
 **/
public class MyLock implements Lock {

    // 当前线程
    AtomicReference<Thread> owner = new AtomicReference<>();
    // 存放等待线程集合
    LinkedBlockingDeque<Thread> waiters = new LinkedBlockingDeque<>();


    @Override
    public void lock() {
        boolean park = false;
        // 没有拿到锁
        while (!tryLock()){
            if (!park){
                // 加入等待集合
                waiters.offer(Thread.currentThread());
                park = true;
            }else {
                LockSupport.park();
            }
        }
        waiters.remove(Thread.currentThread());
    }

    @Override
    public void lockInterruptibly() throws InterruptedException {

    }

    @Override
    public boolean tryLock() {
        // CAS 修改内存操作
        boolean tryLock = owner.compareAndSet(null, Thread.currentThread());
        return tryLock;
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return false;
    }

    @Override
    public void unlock() {
        // 释放锁之后要通知等待者
        if (owner.compareAndSet(Thread.currentThread(), null)){
            // 遍历等待者，通知继续执行
            Thread next = null;
            while ((next = waiters.peek()) != null){
                LockSupport.unpark(next);
            }
        }
    }

    @Override
    public Condition newCondition() {
        return null;
    }
}
