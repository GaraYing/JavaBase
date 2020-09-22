package com.gara.design.pattern.adapter.classadapter;

public class ChildAdapter extends ParentAdaptee {

    public void request(){
        super.specificRequest();
        System.out.println("ChildAdapter#request() executed *****");
    }
}
