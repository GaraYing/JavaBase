package com.gara.design.pattern.adapter.objectadapter;

public class AndroidAdaptee implements ChargeAdaptee{

    @Override
    public void chargeMobile(String type) {
        System.out.println("charging huawei ……");
    }
}
