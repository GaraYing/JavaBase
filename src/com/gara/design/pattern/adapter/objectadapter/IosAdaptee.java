package com.gara.design.pattern.adapter.objectadapter;

public class IosAdaptee implements ChargeAdaptee{

    @Override
    public void chargeMobile() {
        System.out.println("charging iphone ……");
    }
}
