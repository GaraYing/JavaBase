package com.gara.design.pattern.adapter.classadapter;

public class ChildAdapter extends ParentAdaptee {


    private final Target target;

    public ChildAdapter(Target target) {
        this.target = target;
    }

    public void request(){
        super.specificRequest();
        System.out.println("ChildAdapter#request() executed *****");
        target.request();
    }
}
