package com.gara.thread;

import com.sun.xml.internal.ws.server.ServerRtException;

/**
 * @description: ThreadLocal学习
 * @author: Gara
 * @createTime: 2020/4/27 17:10
 * @Version: 1.0
 **/
public class ThreadLocalDemo {

    public static final ThreadLocal<String> threadLocal = new ThreadLocal<>();
    public static final ThreadLocal<String> threadLocal2 = new ThreadLocal<>();

    private String content;
    private String log;

    public String getContent() {
        return  threadLocal.get();
    }

    public void setContent(String content) {
        threadLocal.set(content);
    }

    public String getLog() {
        return threadLocal2.get() + "\n";
    }

    public void setLog(String log) {
        threadLocal2.set(log);
    }

    public static void main(String[] args) {
        ThreadLocalDemo demo = new ThreadLocalDemo();
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(() -> {
                demo.setContent(Thread.currentThread().getName() + "的数据");
                demo.setLog("---------------------");
//                System.out.println("-----------------------");
                System.out.println(demo.getLog() + Thread.currentThread().getName() + "--->" + demo.getContent());
            });
            thread.setName("线程" + i);
            thread.start();
        }
    }
}
