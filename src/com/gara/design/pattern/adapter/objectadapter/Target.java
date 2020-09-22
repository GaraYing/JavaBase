package com.gara.design.pattern.adapter.objectadapter;

public class Target {
    private final ChargeAdapter chargeAdapter;

    public Target(ChargeAdapter chargeAdapter) {
        this.chargeAdapter = chargeAdapter;
    }


    public void charge(){
        chargeAdapter.chargeMobile("ios");
        System.out.println("Target#charge() ***");
    }
}
