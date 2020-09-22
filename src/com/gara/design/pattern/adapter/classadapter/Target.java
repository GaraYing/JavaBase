package com.gara.design.pattern.adapter.classadapter;

public class Target {

    private final ChildAdapter childAdapter;

    public Target(ChildAdapter childAdapter) {
        this.childAdapter = childAdapter;
    }

    public void request(){
        childAdapter.request();
        System.out.println("Target#request() executed *****");
    }
}
