package com.gara.design.pattern.facade;

public class Facade {

    private final SubSystem subSystem;

    public Facade(SubSystem subSystem) {
        this.subSystem = subSystem;
    }


    public void startSystem(){
        subSystem.init();
        subSystem.startApp();
    }

    public void stopSystem(){
        subSystem.destory();
        subSystem.stopApp();
    }
}
