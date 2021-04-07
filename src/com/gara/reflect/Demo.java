package com.gara.reflect;

import java.lang.reflect.Method;

public class Demo {
    public static void main(String[] args) throws Exception {
        Class<Demo> demoClass = Demo.class;

//        Method method = demoClass.getMethod("run");
        Method method = demoClass.getDeclaredMethod("run", String.class);
        method.setAccessible(true);
        Object invoke = method.invoke(demoClass.newInstance(),"123");

    }

    private void run(String abc){
        System.out.println(abc + "method run() executed");
    }
}
