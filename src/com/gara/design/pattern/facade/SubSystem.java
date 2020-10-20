package com.gara.design.pattern.facade;

public class SubSystem {

    void init(){
        System.out.println("system init ********");
    }

    void startApp(){
        System.out.println("system starting ********");
    }

    void destory(){
        System.out.println("system destory ********");
    }

    void stopApp(){
        System.out.println("system stopping ********");
    }
}
